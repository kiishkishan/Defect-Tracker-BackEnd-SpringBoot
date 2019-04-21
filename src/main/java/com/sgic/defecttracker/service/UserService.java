package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.User;

@Service
public interface UserService {
	
	void saveUser(User user );
	public List<User> findAll();

}
