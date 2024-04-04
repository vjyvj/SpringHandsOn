package com.springboot.handson.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="location")
	private String location;
	@Column(name="user_type")
	private String userType;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", userType="
				+ userType + "]";
	}
	
}
