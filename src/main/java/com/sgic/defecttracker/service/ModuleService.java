package com.sgic.defecttracker.service;

import java.util.List;

import com.sgic.defecttracker.model.Module;


public interface ModuleService {
	void saveModule(Module module);
	public List<Module> findAll();
	
	Module getModuleById(Long id);
	public void deleteModuleById(Long id);
	void updateModule(Module module);
}
