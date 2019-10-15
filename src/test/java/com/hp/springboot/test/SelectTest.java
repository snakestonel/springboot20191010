package com.hp.springboot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hp.springboot.entities.Person;
import com.hp.springboot.service.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectTest {
	
	@Autowired
	PersonService personservice;
	@Autowired
	Person person;
	
	@Test
	public void test1(){

		Person person = new Person();
		List<Person> result = personservice.getMan();
		
		for(int i=0;i<result.size();i++){
			person = result.get(i);
			System.out.print(person.getT_id()+"  ");
			System.out.print(person.getT_age()+"  ");
			System.out.print(person.getT_birth()+"  ");
			System.out.print(person.getT_sex()+"  ");
			System.out.print(person.getT_age()+"  ");
			System.out.println(person.getT_salary()+"  ");
			
		}
		
	}

}
