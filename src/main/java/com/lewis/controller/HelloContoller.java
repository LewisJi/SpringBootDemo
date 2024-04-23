package com.lewis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lewis.service.HelloService;

@RestController
public class HelloContoller {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/get")
	public String hello() {
		return helloService.getHello();
	}

	@PostMapping("/post")
	public String addHello() {
		return "Post123";
	}
	
	@PutMapping("/put")
	public String putHello() {
		return "put";
	}
	
	@DeleteMapping("/del")
	public String delHello() {
		return "del";
		
	}
}
