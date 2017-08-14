package com.aysun.relation.services;

import org.springframework.stereotype.Service;

import com.aysun.relation.models.License;
import com.aysun.relation.repositories.LicenseRepo;

@Service
public class DriverService {
	
	private LicenseRepo licenseRepo;
	
	public DriverService(LicenseRepo licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	
	public void addLicense(License license) {
		licenseRepo.save(license);
	}
}