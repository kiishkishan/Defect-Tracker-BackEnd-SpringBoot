package com.sgic.defecttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.defecttracker.model.Module;


@Repository
public interface ModuleRepository extends JpaRepository <Module, Long>{

	Module findModuleById(Long id);
	
}
