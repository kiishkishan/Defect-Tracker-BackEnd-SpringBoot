package com.sgic.defecttracker.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.service.ModuleService;
import com.sgic.defecttracker.service.ProjectService;
import com.sgic.defecttracker.service.UserService;
import com.sgic.defecttracker.dto.Moduledto;
import com.sgic.defecttracker.model.Module;
import com.sgic.defecttracker.model.Project;
import com.sgic.defecttracker.model.User;

@RestController
@RequestMapping("/module")
public class ModuleController {
	
	@Autowired
	ModuleService moduleService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ProjectService projectService;
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("/dto")
//	public Moduledto getabc() {
//		return new Moduledto();
//	} 
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/save")
	public HttpStatus createModule(@Valid @RequestBody Moduledto moduledto) {
		
		Module module=new Module();
		module.setName(moduledto.getName());
		
		Project project = projectService.findProjectById(moduledto.getProject_id());
		module.setProject(project);
		
		User user = userService.getUserById(moduledto.getUser_id());
		module.setUser(user);
		
		moduleService.saveModule(module);
		return HttpStatus.CREATED;
	}

//	@PostMapping("/save")
//	public HttpStatus createModule(@Valid @RequestBody Module module) {
//		moduleService.saveModule(module);
//		return HttpStatus.CREATED;
//	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getall")
	public List<Module> findProject(Moduledto moduledto){
		
		
		List<Module> modules = (List<Module>) moduleService.findAll();
		 return modules;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("getModuleId/{id}")
	public Module getModuleById(@PathVariable("id") Long id) {
		Module getModule = moduleService.getModuleById(id);
		return getModule;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/update/{id}")
	public ResponseEntity<Module> updatemodule(@Valid @RequestBody Module module){
		moduleService.updateModule(module);
		return new ResponseEntity<Module>(module, HttpStatus.NO_CONTENT);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("delete/{id}")
	public void deleteModuleById(@PathVariable("id") Long id) {
		moduleService.deleteModuleById(id);
		
	}
	
}
