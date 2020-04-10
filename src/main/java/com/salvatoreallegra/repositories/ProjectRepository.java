package com.salvatoreallegra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvatoreallegra.entities.Projects;

public interface ProjectRepository extends JpaRepository<Projects, Long> {

}
