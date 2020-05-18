package com.cpg.fms.user.Exceptions;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String message) {
		super(message);
	}
}
