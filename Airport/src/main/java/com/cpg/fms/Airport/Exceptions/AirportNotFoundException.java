package com.cpg.fms.Airport.Exceptions;

public class AirportNotFoundException extends RuntimeException {
   public AirportNotFoundException(String message) {
	   super(message);
   }
}
