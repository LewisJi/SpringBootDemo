package com.lewis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

	@GetMapping("/good")
	public String hello() {
		return "good job";
	}

}
