 package com.salvatoreallegra;

import java.util.ArrayList;
import java.util.List;


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
			
			List<String> technologies1 = new ArrayList<>();
			technologies1.add("CSS Grid");
			technologies1.add("SVG");
			technologies1.add("Canvas API");

			List<String> technologies2 = new ArrayList<>();
			technologies2.add("React");
			technologies2.add("Spring Boot");
			

			List<String> technologies3 = new ArrayList<>();
			technologies3.add("GraphQL");
			technologies3.add("React");
			

			List<String> technologies4 = new ArrayList<>();
			technologies4.add("Node.js");
			technologies4.add("React");
			technologies4.add("C#");
			
			Projects testProject = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setTechnologies(technologies1);
			testProject.setId(1);
			projectRepository.save(testProject);	
			
			Projects testProject2 = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setTechnologies(technologies2);
			testProject.setId(2);
			projectRepository.save(testProject);	
			
			Projects testProject3 = new Projects();
			testProject.setProjectName("React Tiles");
			testProject.setProjectDescription("Color Picker");
			testProject.setTechnologies(technologies3);
			testProject.setId(3);
			projectRepository.save(testProject);	
			
			Projects testProject4 = new Projects();
			testProject.setProjectName("React Fun Axios");
			testProject.setProjectDescription("Color Picker");
			testProject.setTechnologies(technologies4);
			testProject.setId(4);
			projectRepository.save(testProject);	
			

		};
	}

}
