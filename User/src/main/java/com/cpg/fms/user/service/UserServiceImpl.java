package com.cpg.fms.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.fms.user.Exceptions.UserAlreadyExistsException;
import com.cpg.fms.user.Exceptions.UserNotFoundException;
import com.cpg.fms.user.model.User;
import com.cpg.fms.user.repository.UserRepositoryInterface;


@Service
public class UserServiceImpl implements UserServiceInterface{
	
	@Autowired
	UserRepositoryInterface userRepository;
	
	public User addUser(User user)
	{
		if(userRepository.existsUserByuserPhone(user.getUserPhone())) {
			 throw new UserAlreadyExistsException("phone no Already Exits");
		  }
		else if(userRepository.existsUserByuserEmail(user.getUserEmail())) {
			 throw new UserAlreadyExistsException("Email id Already Exits");
		  }
	 return userRepository.save(user);
	}
	
	public User viewUser(Long userId) {
		// TODO Auto-generated method stub
		if (!userRepository.existsById(userId)) {
			throw new UserNotFoundException(" User not found");
		}
		return userRepository.viewUser(userId);
	}

   public List<User> viewUsers(){	
	  return userRepository.findAll();
   }
   public User updateUser(User user) {
		
	   return userRepository.save(user);
	}
	
	public void deleteUser(Long userId) {
		 if(!userRepository.existsById(userId)) {
			 throw new UserNotFoundException("User ID with "+userId+" is NOT FOUND");
		 }
		 userRepository.deleteById(userId);
	 }
	
	public User login(User user) {
		String tempEmailId=user.getUserEmail();
		String tempPass=user.getUserPassword();
		User userObj=null;
		if(tempEmailId!=null && tempPass!=null) {
		   userObj= userRepository.findUserByUserEmailAndUserPassword(tempEmailId,tempPass);
	}
		if(userObj==null) {
			throw new UserNotFoundException("user does not exists");
		}
	return userObj;
}
}
