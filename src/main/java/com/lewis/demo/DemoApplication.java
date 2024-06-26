package com.lewis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	    scanBasePackages={
	            "com.lewis.demo",
	            "com.lewis"
	        }
	    )
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
}
