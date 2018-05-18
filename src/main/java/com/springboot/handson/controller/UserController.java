package com.springboot.handson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.handson.entity.User;
import com.springboot.handson.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	/*@PostMapping("/validateUser")
	public ResponseEntity<?> validateUser(@RequestBody Login login) {
		return null;
	}*/
	
	@GetMapping("/")
	public String showPage(Model model) {
		System.out.println("Inside Hi");
		model.addAttribute("users", userService.getAllUser());
		return "user";
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "redirect/";
	}
	
	@GetMapping("/getUserById")
	@ResponseBody
	public User getUserById(@PathVariable Integer userId) {
		System.out.println("@@@@@@@ controller 43");
		return userService.getUserById(userId);
	}
	
	@GetMapping("/getAllUsers")
	public String getAllUser(Model model) {
		model.addAttribute("users", userService.getAllUser());
		return "user";
	}
	
	@PostMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		userService.deleteUser(userId);
		return "redirect/";
	}
	
	@GetMapping("/getUserByName/{name}")
	public User getUserByName(@PathVariable String name) {
		return userService.getUserByName(name);
		
	}
}
