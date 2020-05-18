package com.cpg.fms.Flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.fms.Flight.Exceptions.FlightExistsException;
import com.cpg.fms.Flight.Exceptions.FlightNotFoundException;
import com.cpg.fms.Flight.model.Flight;
import com.cpg.fms.Flight.repository.FlightRepositoryInterface;

@Service
public class FlightServiceImpl implements FlightServiceInterface{
    
	@Autowired
	FlightRepositoryInterface flightRepository;
	
	
	public Flight addFlight (Flight flight) {
		  System.out.println(flight);
		  if(flightRepository.existsById(flight.getFlightNumber())) {
			 throw new FlightExistsException("Flight Already Exits");
		  }
		 return flightRepository.save(flight);
	  }	
	
	
	public Flight getFlightById(int flightNumber) {
			// TODO Auto-generated method stub
			if (!flightRepository.existsById(flightNumber)) {
				throw new FlightNotFoundException(" Flight not found");
			}
			return flightRepository.getFlight(flightNumber);
		}

	public List<Flight> getAll(){	
		return flightRepository.findAll();
	}
 
	
	public Flight modifyFlight(Flight flight) {
		
	   return flightRepository.save(flight);
	}
	
	public void deleteFlight(int flightNumber) {
		 if(!flightRepository.existsById(flightNumber)) {
			 throw new FlightNotFoundException("flightNumber with "+flightNumber+" is NOT FOUND");
		 }
		 flightRepository.deleteById(flightNumber);
	 }
	
}
