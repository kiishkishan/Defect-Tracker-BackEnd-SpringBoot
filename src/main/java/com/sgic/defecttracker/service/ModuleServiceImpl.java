package com.sgic.defecttracker.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.Module;
import com.sgic.defecttracker.repository.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	ModuleRepository moduleRepository;

	@Override
	public void saveModule(Module module) {
		// TODO Auto-generated method stub
		moduleRepository.save(module);
		
	}
	

	@Override
	public List<Module> findAll() {
		 List<Module> module = (List<Module>) moduleRepository.findAll();
		return module;
	}

//	@Override
//	public Module getModuleById(Long id) {
//		return moduleRepository.findModuleById(id);
//	}
//
//
//	@Override
//	public void deleteModuleById(Long id) {
//		Module module = moduleRepository.findModuleById(id);
//		moduleRepository.delete(module);
//		
//	}


	@Override
	public void updateModule(Module module) {
		moduleRepository.save(module);
		
	}


	@Override
	public Module getModuleById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteModuleById(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
