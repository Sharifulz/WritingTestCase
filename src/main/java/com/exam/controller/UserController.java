package com.exam.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.service.IUserService;


@RestController
public class UserController {
	@Autowired
	IUserService userService;
	
	@GetMapping("/")
	public String user() {   
		

		Map<String, Object> data = new HashMap<>();

		return "WELCOME PORT 8080";
	}
	
	
	
}
