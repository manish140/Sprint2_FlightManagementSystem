package com.cpg.fms.Airport.Exceptions;

public class AirportExistsException extends RuntimeException{
  public AirportExistsException(String message) {
	  super(message);
  }
}
