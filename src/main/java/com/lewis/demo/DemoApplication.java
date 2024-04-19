package com.lewis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	    scanBasePackages={
	            "com.lewis.demo",
<<<<<<< Upstream, based on 789611abbd9d891b2f0bc21ba19788e223dec94d
	            "com.lewis"
=======
	            "com.lewis.controller"
>>>>>>> 87c6ec8 init project
	        }
	    )
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
}
