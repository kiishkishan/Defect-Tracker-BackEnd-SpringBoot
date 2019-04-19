package com.sgic.defecttracker.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.fasterxml.jackson.databind.Module;

@Repository
public interface ModuleRepository extends JpaRepository <Module, Long>{
	 List<Module> findByProjectId(Long projectId);

}
