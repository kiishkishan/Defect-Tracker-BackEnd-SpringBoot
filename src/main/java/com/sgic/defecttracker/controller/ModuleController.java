package com.sgic.defecttracker.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.service.ModuleService;
import com.sgic.defecttracker.model.Module;

@RestController
public class ModuleController {
	
	@Autowired
	ModuleService moduleService;
	
	
	@PostMapping("/saveModule")
	public HttpStatus createModule(@Valid @RequestBody Module module) {
		moduleService.saveModule(module);
		return HttpStatus.CREATED;
	}
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("getall")
//	public List<Module> findProject(Module module){
//		List<Module> modules = (List<Module>) moduleService.findAll();
//		 return modules;
//	}
//	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("getmodule/{id}")
//	public Module getMainById(@PathVariable("id") Long id) {
//		Module issueById=moduleService.getModuleById(id);
//		return issueById;	
//	}
//	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping("getusermodule/{id}")
//	public Module getModuleByUserId(@PathVariable("id") Long id) {
//		Module issueById=moduleService.getModuleByUserId(id);
//		return issueById;	
//	}
	
	
}
