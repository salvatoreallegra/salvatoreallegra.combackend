 package com.salvatoreallegra;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salvatoreallegra.entities.Projects;
import com.salvatoreallegra.repositories.ProjectRepository;

@SpringBootApplication
public class SalvatoreAllegra {

	public static void main(String[] args) {
		
		SpringApplication.run(SalvatoreAllegra.class, args);	
		
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
