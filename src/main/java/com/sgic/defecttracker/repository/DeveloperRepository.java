package com.sgic.defecttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.defecttracker.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer,Long>{

}