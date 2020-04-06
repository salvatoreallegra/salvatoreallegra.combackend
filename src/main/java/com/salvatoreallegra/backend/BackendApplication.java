 package com.salvatoreallegra.backend;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.salvatoreallegra.backend.entities.Projects;
import com.salvatoreallegra.backend.repositories.ProjectRepository;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		SpringApplication.run(BackendApplication.class, args);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4}, 4);
		System.out.println(result);
		
	}
	
	@Bean
	public CommandLineRunner demo(ProjectRepository projectRepository) {
		return (args) -> {
			
			Projects testProject = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setProjectLanguage("Java");
			testProject.setId(1);
			projectRepository.save(testProject);	
			
			Projects testProject2 = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setProjectLanguage("Java");
			testProject.setId(2);
			projectRepository.save(testProject);	
			
			Projects testProject3 = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setProjectLanguage("Java");
			testProject.setId(3);
			projectRepository.save(testProject);	
			
			Projects testProject4 = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setProjectLanguage("Java");
			testProject.setId(4);
			projectRepository.save(testProject);	
			

		};
	}

}
