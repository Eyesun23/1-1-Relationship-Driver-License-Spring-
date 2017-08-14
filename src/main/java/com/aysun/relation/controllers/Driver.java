package com.aysun.relation.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aysun.relation.models.License;
import com.aysun.relation.models.Person;
import com.aysun.relation.services.DriverService;
import com.aysun.relation.services.PersonService;

@Controller
@RequestMapping("/")
public class Driver {
	
	private final PersonService personService;
	private final DriverService driverService;
	
	public Driver(PersonService personService, DriverService driverService) {
		this.personService = personService;
		this.driverService = driverService;
	}
	
	@GetMapping("persons/new")
	public String newPerson(@ModelAttribute("person") Person person, Model model) {
		return "person.jsp";
	}
	
	@PostMapping("persons/new")
	public String createPerson(
			@Valid @ModelAttribute("person") Person person,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "person.jsp";
		} else {
			personService.addPerson(person);
			return "redirect:/licenses/new";
		}
	}
	
	@GetMapping("licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		model.addAttribute("persons", personService.getAllPersons());
		return "new.jsp";
	}
	
	@PostMapping("licenses/new")
	public String createLicense(
			@RequestParam(value="person") Long id,
			@Valid @ModelAttribute("license") License license,
			BindingResult result,
			Model model) {
		model.addAttribute("persons", personService.getAllPersons());
		if (result.hasErrors()) {
			return "new.jsp";
		} else if (personService.findPersonById(id).getLicense() != null) {
			return "new.jsp";
		} else {
			driverService.addLicense(license);
			return "redirect:/persons/" + id;
		}
	}
	
	@GetMapping("persons/{id}")
	public String showPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", personService.findPersonById(id));
		return "details.jsp";
	}
}