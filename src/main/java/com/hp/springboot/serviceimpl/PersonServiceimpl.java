package com.hp.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.springboot.entities.Person;
import com.hp.springboot.mapper.PersonDAO;
import com.hp.springboot.service.PersonService;

@Service
public class PersonServiceimpl implements PersonService{
	
	@Autowired 
	PersonDAO persondao;
	
	@Override
	public List<Person> getMan(){
		
		return persondao.getMan();
		
	}
	
	@Override
	public List<Person> getAll(){
		
		return persondao.getAll();
		
	}
	
}
