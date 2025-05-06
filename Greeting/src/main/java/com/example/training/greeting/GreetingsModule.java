package com.example.training.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingsModule {
	public GreetingsModule() {
		System.out.println("Greetings Module is initialized .... ");
	}

	@RequestMapping(path = "/greetings/{userName}", method = RequestMethod.GET)
	public String greetUser(@PathVariable("userName") String username){
		return "Greetings " + username + "! Welcome to Spring Boot Microservices";
	}
}

