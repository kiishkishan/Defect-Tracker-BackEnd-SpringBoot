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
		
		User user = userService.findUserById(moduledto.getUser_id());
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
	public List<Module> findProject(Module module){
		List<Module> modules = (List<Module>) moduleService.findAll();
		 return modules;
	}
	
//
//	@GetMapping("getmodule/{id}")
//	public Module getMainById(@PathVariable("id") Long id) {
//		Module issueById=moduleService.getModuleById(id);
//		return issueById;	
//	}
//	
//
//	@GetMapping("getusermodule/{id}")
//	public Module getModuleByUserId(@PathVariable("id") Long id) {
//		Module issueById=moduleService.getModuleByUserId(id);
//		return issueById;	
//	}
//	
	
}
