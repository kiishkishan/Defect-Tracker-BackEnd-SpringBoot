package com.sgic.defecttracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.repository.ModuleRepository;
import com.sgic.defecttracker.repository.ProjectRepository;

@RestController
public class ModuleController {
	
	@Autowired
	private ModuleRepository moduleRepository;
	
	@Autowired
	private ProjectRepository projectRepository;

}
