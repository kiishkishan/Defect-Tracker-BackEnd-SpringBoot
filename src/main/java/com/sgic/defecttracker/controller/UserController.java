package com.sgic.defecttracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defecttracker.repository.ProjectRepository;
import com.sgic.defecttracker.repository.UserRepository;
import com.sgic.defecttracker.exception.ResourceNotFoundException;
import com.sgic.defecttracker.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping
	public User createUser(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PutMapping("/user/{userId}")
	public User updateUser(@PathVariable Long userId,
			@Valid @RequestBody User userRequest) {
		return userRepository.findById(userId)
				.map(user ->{
					user.setName(userRequest.getName());
					user.setType(userRequest.getType());
					return userRepository.save(user);
				}).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
	}
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
		return userRepository.findById(userId)
				.map(user ->{
					userRepository.delete(user);
					  return ResponseEntity.ok().build();
				}).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
	}
	

}
