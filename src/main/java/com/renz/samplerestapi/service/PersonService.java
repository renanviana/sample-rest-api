package com.renz.samplerestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renz.samplerestapi.entities.Person;
import com.renz.samplerestapi.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRep;
	
	public void save(Person person) {
		personRep.save(person);
	}
	
	public List<Person> findAll() {
		return personRep.findAll();
	}
	
}
