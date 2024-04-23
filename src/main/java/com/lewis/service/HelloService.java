package com.lewis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.repo.HelloRepos;

@Service
public class HelloService {
	
	@Autowired
	private HelloRepos helloRepos;
	
	public String getHello() {
		return helloRepos.qryHello();
		
	}

}
