package com.salvatoreallegra.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projects {
	
	@Id
	private long id;
	private String projectName;
	private String projectDescription;
	
	@ElementCollection
	private List<String> technologies;
	
	public Projects() {
		
	}
	
	public Projects(long id, String projectName, String projectDescription, List<String> technologies) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.technologies = technologies;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	
	

}
