package com.aysun.relation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aysun.relation.models.Person;
import com.aysun.relation.repositories.PersonRepo;

@Service
public class PersonService {
	
	private PersonRepo personRepo;
	
	public PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
	
	public List<Person> getAllPersons() {
		return (List<Person>) personRepo.findAll();
	}
	
	public void addPerson(Person person) {
		personRepo.save(person);
	}
	
	public Person findPersonById(Long id) {
		return personRepo.findOne(id);
	}
}