package com.sgic.defecttracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sgic.defecttracker.service.UserService;
import com.sgic.defecttracker.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getall")
	public  List<User> findallUser(User user) {
	
		 List<User> users = (List<User>) userService.findAll();
		 return users;
	        	
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/save")
	public HttpStatus createUser(@Valid @RequestBody User user) {
		userService.saveUser(user);
		return HttpStatus.CREATED;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("getUserById/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		User getUser = userService.getUserById(id);
		return getUser;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
		userService.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.NO_CONTENT);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("delete/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		userService.deleteUserById(id);
		
	}
	
	
	

}
