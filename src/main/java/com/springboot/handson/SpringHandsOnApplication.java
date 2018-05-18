package com.springboot.handson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.handson.dao.UserDao;
import com.springboot.handson.entity.User;


@SpringBootApplication
public class SpringHandsOnApplication implements CommandLineRunner{

	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringHandsOnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userDao.save(new User("Vijay",27,"Chennai","Active"));
		userDao.save(new User("Suresh",26,"Erode","INActive"));
		userDao.save(new User("Raj",31,"Otanchathiram","Active"));
		userDao.save(new User("Raghav",24,"Pollachi","Active"));
		userDao.save(new User("Kavitha",24,"Coimbatore","INActive"));
	 }
}
