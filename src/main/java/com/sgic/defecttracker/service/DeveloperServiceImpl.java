package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.Developer;
import com.sgic.defecttracker.repository.DeveloperRepository;

@Service
public class DeveloperServiceImpl implements DeveloperService {
	@Autowired
	DeveloperRepository developerRepository ;
	


	@Override
	public void saveDeveloper(Developer developer) {
		developerRepository.save(developer);
		
	}

	@Override
	public List<Developer> findAll() {
		  List<Developer> main = (List<Developer>) developerRepository.findAll();
	        
	        return main;
	}

}
