package com.cpg.fms.Flight.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
   
	@Id
	private int flightNumber;
	private String flightModel;
	private String carrierName;
	private int seatCapacity;
	
	public Flight(int flightNumber,String flightModel,String carrierName,int seatCapacity) {
		super();
		this.flightNumber=flightNumber;
		this.flightModel=flightModel;
		this.carrierName=carrierName;
		this.seatCapacity=seatCapacity;
	}
   
	public Flight() {
		super();
	}
	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
