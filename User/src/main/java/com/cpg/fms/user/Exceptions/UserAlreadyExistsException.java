package com.cpg.fms.user.Exceptions;

public class UserAlreadyExistsException extends RuntimeException {

	public UserAlreadyExistsException(String message) {
		super(message);
	}
}
