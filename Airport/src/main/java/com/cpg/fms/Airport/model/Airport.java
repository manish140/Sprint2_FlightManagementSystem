package com.cpg.fms.Airport.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class Airport {
     
	
	
	private String airportName;
	@Id
	private String airportCode;
	private String airportLocation;
	
	
	public Airport(String airportName,String airportCode,String airportLocation) {
		this.airportName=airportName;
		this.airportCode=airportCode;
		this.airportLocation=airportLocation;
	}
	public Airport() {
		super();
	}

	public String getAirportName() {
		return airportName;
	}


	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public String getAirportCode() {
		return airportCode;
	}


	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}


	public String getAirportLocation() {
		return airportLocation;
	}


	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
}
