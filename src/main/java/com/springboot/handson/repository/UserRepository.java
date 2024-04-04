package com.springboot.handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.handson.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	public User findByName(String name);
}
