package com.sgic.defecttracker.service;

import java.util.List;

import com.sgic.defecttracker.model.Developer;

public interface DeveloperService {
void saveDeveloper(Developer developer);
	
	public List<Developer> findAll();

}
