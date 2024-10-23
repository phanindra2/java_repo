package com.practice.DemoMS_1.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.DemoMS_1.Entity.Limits;

//@RestController("/demo")
@RestController
public class DemoController {
	@Autowired
	private Limits limit;
	
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
		return limit;
		
	}

}
