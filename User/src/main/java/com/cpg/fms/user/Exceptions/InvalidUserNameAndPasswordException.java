package com.cpg.fms.user.Exceptions;

public class InvalidUserNameAndPasswordException extends RuntimeException{

	public InvalidUserNameAndPasswordException(String message) {
		super(message);
	}
}
