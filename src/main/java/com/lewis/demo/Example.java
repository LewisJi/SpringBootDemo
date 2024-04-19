package com.lewis.demo;

import org.springframework.stereotype.Controller;

@Controller
class Example {
   
   public String hello() {
      return "Hello Spring Boot";
   }
}