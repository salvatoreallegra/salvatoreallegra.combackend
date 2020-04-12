package com.salvatoreallegra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salvatoreallegra.entities.Projects;
import com.salvatoreallegra.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	
	@Autowired  
	ProjectRepository projectRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Projects> getAllProjects()   
	{  
		List<Projects> books = new ArrayList<>();  
		return projectRepository.findAll();
	}  
}