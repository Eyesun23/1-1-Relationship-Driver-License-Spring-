package com.aysun.relation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aysun.relation.models.License;

@Repository
public interface LicenseRepo extends CrudRepository<License, Long> {

}