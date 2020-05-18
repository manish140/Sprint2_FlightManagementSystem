package com.cpg.fms.Flight.service;

import java.util.List;

import com.cpg.fms.Flight.model.Flight;

public interface FlightServiceInterface {

	
    public Flight addFlight(Flight flight);
    public Flight getFlightById(int flightNumber);
    public List<Flight> getAll();
    public Flight modifyFlight(Flight flight);
	public void deleteFlight(int flightNumber);
	
	
}
