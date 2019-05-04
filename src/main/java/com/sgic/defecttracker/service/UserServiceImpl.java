package com.sgic.defecttracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defecttracker.model.User;
import com.sgic.defecttracker.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> findAll() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}

//	@Override
//	public User findUserById(Long id) {
//		return userRepository.findUserById(id);
//	}

	@Override
	public User getUserById(Long id) {
		
		return userRepository.findUserById(id);
	}

	@Override
	public void deleteUserById(Long id) {
		User user = userRepository.findUserById(id);
		userRepository.delete(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

//	@Override
//	public User findUserById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
