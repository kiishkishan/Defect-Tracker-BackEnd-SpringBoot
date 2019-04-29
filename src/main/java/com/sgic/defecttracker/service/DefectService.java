package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.Defect;



@Service
public interface DefectService {
	void saveDefect(Defect defect);
	public List<Defect> findAll();
	
	Defect getDefectById(Long id);
	public void deleteDefectById(Long id);
	void updateDefect(Defect defect);

}
