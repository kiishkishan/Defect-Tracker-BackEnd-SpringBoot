package com.sgic.defecttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttracker.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
}
