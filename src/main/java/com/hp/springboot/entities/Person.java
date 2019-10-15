package com.hp.springboot.entities;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	
	private String t_id;
	private String t_name;
	private String t_password;
	private String t_birth;
	private String t_sex;
	private int t_age;
	private int t_salary;
	
	
	public String getT_id() {
		return t_id;
	}
	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_password() {
		return t_password;
	}
	public void setT_password(String t_password) {
		this.t_password = t_password;
	}
	public String getT_birth() {
		return t_birth;
	}
	public void setT_birth(String t_birth) {
		this.t_birth = t_birth;
	}
	public String getT_sex() {
		return t_sex;
	}
	public void setT_sex(String t_sex) {
		this.t_sex = t_sex;
	}
	public int getT_age() {
		return t_age;
	}
	public void setT_age(int t_age) {
		this.t_age = t_age;
	}
	public int getT_salary() {
		return t_salary;
	}
	public void setT_salary(int t_salary) {
		this.t_salary = t_salary;
	}
	
}