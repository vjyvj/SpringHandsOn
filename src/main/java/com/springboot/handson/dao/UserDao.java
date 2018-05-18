package com.springboot.handson.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.handson.entity.User;

public interface UserDao extends CrudRepository<User,Integer>{

	public User findByName(String name);
	
}
