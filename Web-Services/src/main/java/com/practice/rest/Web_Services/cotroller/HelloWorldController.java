package com.practice.rest.Web_Services.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello WOrld";
	}
	
	@GetMapping("/hello-world/{name}")
	public String helloWorldUsingPath(@PathVariable String name) {
		return "Hello "+name;
	}

}
