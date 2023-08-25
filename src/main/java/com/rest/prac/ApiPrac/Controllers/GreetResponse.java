package com.rest.prac.ApiPrac.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetResponse {
    @GetMapping("/") //Maps the the method to / | @GetMapping is used for GET requests
    public grtResponse greet() {
        return new grtResponse(
                "Hello",
                List.of("C++", "Java", "JavaScript", "Rust"),
                new Person("Tyrell", 21)
        ); //This will return a JSON object
        //The object is the response that is returned

	 	/*
	 		The reason why it returns a JSON object
	 		is that The annotation @RestController indicates that the class is a controller,
	 		and that all the methods in the marked class will return a JSON object
	 	*/
    }

    record Person(String name, int age) {}

    //Return a JSON Object
    record grtResponse(String res, List<String> programmingLangs, Person person) {} //res is the key
}
