package com.springboot.handson.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.handson.dao.UserDao;
import com.springboot.handson.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		userDao.save(user);
	}
	
	public User getUserById(@PathVariable Integer userId) {
		System.out.println("@@@@@@ 25");
		return userDao.findById(userId).get();
		
	}
	
	public List<User> getAllUser() {
		System.out.println("@@@@@@@@");
		List<User> allUsers = new ArrayList<User>();
		userDao.findAll().forEach(allUsers::add);
		System.out.println("@@@@@@@@-->"+allUsers.size());
		return allUsers;
		
	}
	
	public void deleteUser(Integer id) {
		userDao.deleteById(id);
	}

	public User getUserByName(String name) {
		return userDao.findByName(name);
	}

}
