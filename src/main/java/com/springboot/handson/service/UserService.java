package com.springboot.handson.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.springboot.handson.exception.UserNotFoundException;
import com.springboot.handson.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.handson.entity.User;

@Service
@AllArgsConstructor
public class UserService {

	private  UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User getUserById(@PathVariable Integer userId) {
		try {
			return userRepository.findById(userId).get();
		} catch (NoSuchElementException ex) {
			throw new UserNotFoundException("The requested user not found in our records !!", ex);
		}
	}
	
	public Optional<List<User>> getAllUser() throws Exception {

		//throw new Exception("Test exception");

		List<User> allUsers = new ArrayList<User>();
		userRepository.findAll().forEach(allUsers::add);
		return Optional.of(allUsers);
		//return null;
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

}
