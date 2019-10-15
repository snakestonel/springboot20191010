package com.hp.springboot.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.springboot.entities.Person;
import com.hp.springboot.mapper.PersonDAO;
import com.hp.springboot.service.PersonService;



@Controller
@RequestMapping("list")
public class ListController {
	
	@Autowired
	PersonService personservice;
	
	@Autowired
	Person person;
	
	@Autowired
	PersonDAO persondao;
	
	@RequestMapping("/html")
    public String getAll(Model model){
		
		
		List<Person> list = personservice.getAll();
		model.addAttribute("users",list);
		
		return "index";
	}
	
	
	 @RequestMapping("jsp")
	    public void testJsp( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
		   List<Person> list = personservice.getAll();
		 
		   request.setAttribute("users",list);
	        request.getRequestDispatcher("/list.jsp").forward(request, response);
	    }

}
