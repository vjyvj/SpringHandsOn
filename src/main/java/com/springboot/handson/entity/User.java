package com.springboot.handson.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private int age;
	
	private String location;
	
	private String userType;

	public User() {}

	public User(String name, int age, String location, String userType) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.userType = userType;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", userType="
				+ userType + "]";
	}
	
}
