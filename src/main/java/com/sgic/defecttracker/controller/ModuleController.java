package com.sgic.defecttracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.repository.ModuleRepository;
import com.sgic.defecttracker.repository.ProjectRepository;
import com.sgic.defecttracker.repository.UserRepository;
import com.sgic.defecttracker.service.ModuleService;
import com.sgic.defecttracker.model.Module;
import com.sgic.defecttracker.model.Project;

@RestController
@RequestMapping("/module/")
public class ModuleController {
	
	@Autowired
	ModuleService moduleService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("save")
	public HttpStatus createModule(@Valid @RequestBody Module module) {
		moduleService.saveModule(module);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("getall")
	public List<Module> findProject(Module module){
		List<Module> modules = (List<Module>) moduleService.findAll();
		 return modules;
	}
	
	

	
	

}
