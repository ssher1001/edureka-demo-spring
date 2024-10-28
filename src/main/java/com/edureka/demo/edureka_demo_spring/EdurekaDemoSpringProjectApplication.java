package com.edureka.demo.edureka_demo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EdurekaDemoSpringProjectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EdurekaDemoSpringProjectApplication.class, args);
	}
	
	@GetMapping("/")
	private String welcome() 
	{
		return String.format("<h1>this i s the welcome page</h1>");

	}
	
	@GetMapping("/hello")
	private String hello() 
	{
		return String.format("<h1>welcome to the devops world</h1>");

	}
	
}
