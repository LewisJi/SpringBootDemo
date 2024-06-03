package com.lewis.repo;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepos {
	
	public String qryHello() {
		return "hello world!";
	}

}
