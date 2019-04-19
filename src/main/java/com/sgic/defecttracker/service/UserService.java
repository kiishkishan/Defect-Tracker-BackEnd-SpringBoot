package com.sgic.defecttracker.service;

import java.util.List;

import com.sgic.defecttracker.model.User;


public interface UserService {
void saveUser(User user );
	
	public List<User> findAll();

}
