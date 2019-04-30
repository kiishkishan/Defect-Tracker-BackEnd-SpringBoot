package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.Project;


@Service
public interface ProjectService {
	void saveProject(Project project);
	public List<Project> findAll();
	
	Project findProjectById(Long id);
}
