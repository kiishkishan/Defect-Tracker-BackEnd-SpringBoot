
package com.sgic.defecttracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.exception.ResourceNotFoundException;
import com.sgic.defecttracker.model.Project;
import com.sgic.defecttracker.repository.ProjectRepository;

@RestController
public class ProjectController {

	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping("/project")
	  public List<Project> getAllProjects(){
    	return projectRepository.findAll();
    }
	
	@PostMapping
	public Project createProject(@Valid @RequestBody Project project) {
		return projectRepository.save(project);
	}
	
	
	@PutMapping("/project/{projectId}")
	public Project updateProject(@PathVariable Long projectId,
			@Valid @RequestBody Project projectRequest) {
		return projectRepository.findById(projectId)
				.map(project -> {
				  project.setName(projectRequest.getName());
				  return projectRepository.save(project);
                }).orElseThrow(() -> new ResourceNotFoundException("Project not found with id " + projectId));
					
	}
	
	@DeleteMapping("/project/{projectId}")
	public ResponseEntity<?> deleteProject(@PathVariable Long projectId){
		return projectRepository.findById(projectId)
				.map(project -> {
					projectRepository.delete(project);
				    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Project not found with id " + projectId));
					
				}
						
	}
	
	

	
