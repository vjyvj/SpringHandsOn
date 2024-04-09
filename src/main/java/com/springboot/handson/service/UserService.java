package com.springboot.handson.service;

import com.springboot.handson.entity.User;
import com.springboot.handson.exception.UserNotFoundException;
import com.springboot.handson.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class UserService {

	private  UserRepository userRepository;
	
	public User addUser(User user) {
		try {
			return userRepository.save(user);
		} catch (RuntimeException ex) {
			throw new RuntimeException("User cannot be added" + ex.getMessage());
		}
	}

	public User getUserById(@PathVariable Integer userId) {
		try {
			return userRepository.findById(userId).get();
		} catch (NoSuchElementException ex) {
			throw new UserNotFoundException("The requested user not found in our records !!", ex);
		}
	}
	
	public Optional<List<User>> getAllUser() throws Exception {

		throw new Exception("Test exception");

//		List<User> allUsers = new ArrayList<User>();
//		userRepository.findAll().forEach(allUsers::add);
//		return Optional.of(allUsers);
		//return null;
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

//	public String getCovidData() {
//		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
//			ResponseEntity e = webClient.get().uri("https://covid-193.p.rapidapi.com/countries").retrieve().toBodilessEntity().block();
//			return e.getBody().toString();
//		});
//		return cf.join().toString();
//    }

}
