package com.salvatoreallegra.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projects {
	
	@Id
	private long id;
	private String projectName;
	private String projectDescription;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
