package com.rest.prac.ApiPrac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //Indicates that this is a rest controller
public class ApiPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPracApplication.class, args);
	}

	//
	@GetMapping("/") //Maps the the method to /
	public String greet() {
		return "Hello";
	}

}
