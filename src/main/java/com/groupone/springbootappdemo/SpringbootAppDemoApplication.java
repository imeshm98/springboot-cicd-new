package com.groupone.springbootappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAppDemoApplication {

	@GetMapping("/")
	public String welcome(){
		return "Welcome all";
	}

	@GetMapping("/login")
	public String login(){
		return "Login Page / Change 2";
	}

	@GetMapping("/home")
	public String home(){
		return "This is Home Page / Change";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppDemoApplication.class, args);
	}

}
