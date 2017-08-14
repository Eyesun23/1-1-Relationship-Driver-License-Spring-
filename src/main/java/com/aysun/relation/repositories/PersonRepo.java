package com.aysun.relation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aysun.relation.models.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {

}