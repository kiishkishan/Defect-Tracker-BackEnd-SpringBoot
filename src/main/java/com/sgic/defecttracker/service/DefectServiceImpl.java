package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.Defect;
import com.sgic.defecttracker.repository.DefectRepository;

@Service
public class DefectServiceImpl implements DefectService{
	@Autowired
	DefectRepository defectRepository;

	@Override
	public void saveDefect(Defect defect) {
		defectRepository.save(defect);
		
	}

	@Override
	public List<Defect> findAll() {
		List<Defect> defect = (List<Defect>) defectRepository.findAll(); 
		return defect;
	}

	@Override
	public Defect getDefectById(Long id) {
		return defectRepository.findDefectById(id);
	}

	@Override
	public void deleteDefectById(Long id) {
		Defect defect = defectRepository.findDefectById(id);
		defectRepository.delete(defect);
		
	}

	@Override
	public void updateDefect(Defect defect) {
		defectRepository.save(defect);
		
	}
	

}
