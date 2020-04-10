package com.salvatoreallegra.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	
	
	@RequestMapping("/login")
	public String loginMessage(@RequestParam String name) {
		
		System.out.println(name);
		return "login";
		
	}

}
