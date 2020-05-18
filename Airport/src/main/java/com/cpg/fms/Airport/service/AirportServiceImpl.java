package com.cpg.fms.Airport.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpg.fms.Airport.Exceptions.AirportExistsException;
import com.cpg.fms.Airport.Exceptions.AirportNotFoundException;
import com.cpg.fms.Airport.model.Airport;
import com.cpg.fms.Airport.repository.AirportRepository;
@Service
public class AirportServiceImpl implements AirportServiceInterface{
 
	@Autowired
	AirportRepository airportRepository;
	public Airport addAirport(Airport airport) {
		if(airportRepository.existsById(airport.getAirportCode())) {
			throw new AirportExistsException("Airprot already exists");
		}
		return airportRepository.save(airport);
	}
	
	
	public Optional<Airport> getAirportById(String airportCode) {
		if(!airportRepository.existsById(airportCode)) {
			throw new AirportNotFoundException("Airport not found");
		}
		return airportRepository.findById(airportCode);
	}
	
	
	public List<Airport> getAllAirports(){
		return airportRepository.findAll();
	}
	
	
	public void deleteAirport(String airportCode) {
			airportRepository.deleteById(airportCode);
	}
	
}
