package com.hp.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hp.springboot.entities.Person;

@Service
public interface PersonService {
	
    List<Person> getAll();
	
	List<Person> getMan();
	
}
