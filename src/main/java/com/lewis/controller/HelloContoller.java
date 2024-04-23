package com.lewis.controller;

<<<<<<< HEAD
<<<<<<< Upstream, based on 789611abbd9d891b2f0bc21ba19788e223dec94d
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 87c6ec8 init project
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
>>>>>>> branch 'main' of https://github.com/LewisJi/SpringBootDemo.git
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
<<<<<<< Upstream, based on 789611abbd9d891b2f0bc21ba19788e223dec94d
import com.lewis.service.HelloService;

=======
>>>>>>> 87c6ec8 init project
=======
import com.lewis.service.HelloService;

>>>>>>> branch 'main' of https://github.com/LewisJi/SpringBootDemo.git
@RestController
public class HelloContoller {

<<<<<<< HEAD
<<<<<<< Upstream, based on 789611abbd9d891b2f0bc21ba19788e223dec94d
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/get")
	public String hello() {
		return helloService.getHello();
=======
	@GetMapping("/good")
	public String hello() {
		return "good job";
>>>>>>> 87c6ec8 init project
=======
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/get")
	public String hello() {
		return helloService.getHello();
>>>>>>> branch 'main' of https://github.com/LewisJi/SpringBootDemo.git
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
