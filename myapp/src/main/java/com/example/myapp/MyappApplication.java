package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
	public String hello() {
		SpringApplication.run(MyappApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "Spring Boot App";
	}
}

