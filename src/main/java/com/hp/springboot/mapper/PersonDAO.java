package com.hp.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hp.springboot.entities.Person;


@Mapper
public interface PersonDAO {
	
	List<Person> getAll();
	
	List<Person> getMan();

}
