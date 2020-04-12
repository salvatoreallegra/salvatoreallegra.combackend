package com.salvatoreallegra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salvatoreallegra.entities.Projects;
import com.salvatoreallegra.repositories.ProjectRepository;
import com.salvatoreallegra.service.ProjectService;


@CrossOrigin
@RestController
public class ProjectController {

	@Autowired  
	ProjectService projectService; 
	
	ProjectController(ProjectService service) {
	    this.projectService = service;
	  }
	
		
	 @GetMapping("/projects")
	  List<Projects> all() {
	    return projectService.getAllProjects();
	  }

}
