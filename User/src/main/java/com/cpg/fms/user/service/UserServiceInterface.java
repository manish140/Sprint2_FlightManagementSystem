package com.cpg.fms.user.service;

import java.util.List;

import com.cpg.fms.user.model.User;

public interface UserServiceInterface {

	public User addUser(User user);
	public User viewUser(Long userId);
	public List<User> viewUsers();
	public User updateUser(User user);
	public void deleteUser (Long userId);
	public User login(User user);
}
