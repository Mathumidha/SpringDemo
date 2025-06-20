package com.SpringDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String greet() {
		System.out.println("I am here...");
		return "Welcome to Telusko!!";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "This a sample Learning Page";
	}

}
