package com.sgic.defecttracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.model.Defect;
import com.sgic.defecttracker.service.DefectService;

@RestController
@RequestMapping("/defect/")
public class DefectController {
	@Autowired
	DefectService defectService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("save")
	public HttpStatus createDefect(@Valid @RequestBody Defect defect) {
		defectService.saveDefect(defect);
		return HttpStatus.CREATED;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("getall")
	public List<Defect> findDefect(Defect defect) {
		List<Defect> defects = (List<Defect>) defectService.findAll();
		return defects;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("getbyid/{id}")
	public Defect getDefectById(@PathVariable("id") Long id) {
		Defect getDefect = defectService.getDefectById(id);
		return getDefect;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("delete/{id}")
	public void deleteDefectById(@PathVariable("id") Long id) {
		defectService.deleteDefectById(id);
		
	}

}
