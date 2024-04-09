package com.springboot.handson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.springboot.handson")
public class SpringHandsOnApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringHandsOnApplication.class, args);
		/**
		 * Total processor count available for thread processing
		 */
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
