package com.sgic.defecttracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.repository.ModuleRepository;
import com.sgic.defecttracker.repository.ProjectRepository;
import com.sgic.defecttracker.repository.UserRepository;

import com.sgic.defecttracker.model.Module;

@RestController
public class ModuleController {
	
	@Autowired
	private ModuleRepository moduleRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private UserRepository userRepository;
	

	
	

}
