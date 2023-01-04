package com.renz.samplerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renz.samplerestapi.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
