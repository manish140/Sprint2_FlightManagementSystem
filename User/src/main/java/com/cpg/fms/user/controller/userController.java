package com.cpg.fms.user.controller;

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

import com.cpg.fms.user.model.User;
import com.cpg.fms.user.service.UserServiceImpl;



@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class userController {


	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
		user=userService.addUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> viewUser(@PathVariable Long userId) {

		User u = userService.viewUser(userId);

		return new ResponseEntity<User>(u, HttpStatus.OK);
	}
	
	
	@GetMapping("/allUsers")
	public ResponseEntity<List<User>> viewUsers() {
		List<User> allUsers = userService.viewUsers();
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {
		userService.updateUser(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<User> deleteUser(@Valid @PathVariable Long userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<User>(HttpStatus.OK);

	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody User user) {
		User user1=userService.login(user);
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	
}
