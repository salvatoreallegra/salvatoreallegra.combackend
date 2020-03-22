package com.salvatoreallegra.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class ProjectController {


	@RequestMapping("/")
	public String sayHello() {
		return "Hello";
	}

}
