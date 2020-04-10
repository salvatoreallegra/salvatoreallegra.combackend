package com.salvatoreallegra.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salvatoreallegra.entities.Projects;
import com.salvatoreallegra.repositories.ProjectRepository;


@CrossOrigin
@RestController
public class ProjectController {

	ProjectRepository repository;
	
	ProjectController(ProjectRepository repository) {
	    this.repository = repository;
	  }
	
	
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/projects")
	  List<Projects> all() {
	    return repository.findAll();
	  }

}
