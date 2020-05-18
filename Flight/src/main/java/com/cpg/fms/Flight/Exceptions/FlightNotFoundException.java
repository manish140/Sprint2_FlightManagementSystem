package com.cpg.fms.Flight.Exceptions;

public class FlightNotFoundException extends RuntimeException{
  public FlightNotFoundException(String message) {
	  super(message);
  }
}
