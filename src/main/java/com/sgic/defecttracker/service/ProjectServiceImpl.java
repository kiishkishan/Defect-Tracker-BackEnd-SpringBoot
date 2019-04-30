package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.Project;
import com.sgic.defecttracker.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectRepository projectRepository;
	
	public void saveProject(Project project) {
		projectRepository.save(project);
		
	}
	
	public List<Project> findAll() {
        List<Project> project = (List<Project>) projectRepository.findAll();
        return project;
    }

	@Override
	public Project findProjectById(Long id) {
		return projectRepository.findProjectById(id);
		
	}




}
