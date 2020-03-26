package com.salvatoreallegra.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvatoreallegra.backend.entities.Projects;

public interface ProjectRepository extends JpaRepository<Projects, Long> {

}
