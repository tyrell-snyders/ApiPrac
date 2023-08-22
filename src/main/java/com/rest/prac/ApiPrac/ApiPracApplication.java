package com.rest.prac.ApiPrac;

import java.util.List;

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
	// @GetMapping("/") //Maps the the method to / | @GetMapping is used for GET requests 
	// public GreetResponse greet() {
	// 	return new GreetResponse(
	// 			"Hello",
	// 			List.of("C++", "Java", "JavaScript", "Rust"),
	// 			new Person("Tyrell", 21)
	// 		); //This will return a JSON object
	// 		//The object is the response that is returned

	// 	/* 
	// 		The reason why it returns a JSON object
	// 		is because The annotation @RestController indicates that the class is a controller,
	// 		and that all the methods in the marked class will return a JSON object
	// 	*/
	// }

	// record Person(String name, int age) {}

	// //Return a JSON Object
	// record GreetResponse(String res, List<String> programmingLangs, Person person) {} //res is the key

}
