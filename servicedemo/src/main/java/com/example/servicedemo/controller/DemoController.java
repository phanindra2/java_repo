package com.example.servicedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicedemo.entity.Limits;

@RestController
public class DemoController {
	@Autowired
	private Limits limit;
	@Autowired
	private Environment env;
	
	@GetMapping("demo")
	public String hello() {
		return "Hello WOrld";
	}
//	@GetMapping("getlimit")
//	public ResponseEntity<Limits> getLimits(){
//		return new ResponseEntity<Limits>(new Limits(10,200), HttpStatus.CONTINUE);
//		
//	}
	@GetMapping("getlimit")
	public Limits getLimits() {
		return new Limits(2,500);
	}
	
	@GetMapping("limitprop")
	
	public Limits giveLimitsFromProperties() {
		limit.setEnvironment(env.getProperty("local.server.port"));
		return limit;
		
	}

}
