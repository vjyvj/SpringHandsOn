package com.springboot.handson.controller;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.springboot.handson.entity.User;
import com.springboot.handson.service.UserService;

@RestController
@RequestMapping(path="/users")
@AllArgsConstructor
public class UserController {

	private UserService userService;


    @PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/user/{userId}")
	@ResponseBody
	public User getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}
	
	@GetMapping("/allusers")
	public Optional<List<User>> getAllUser() {
		try {
			return userService.getAllUser();
		} catch(Exception ex) {
			System.out.println("Exception during get all users"+ ex);
		}
		return null;
	}
	
	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		userService.deleteUser(userId);
	}
	
	@GetMapping("/userbyname/{name}")
	public User getUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
}
