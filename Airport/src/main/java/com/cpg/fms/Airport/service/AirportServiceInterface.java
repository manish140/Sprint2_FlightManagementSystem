package com.cpg.fms.Airport.service;

import java.util.List;
import java.util.Optional;

import com.cpg.fms.Airport.model.Airport;

public interface AirportServiceInterface {
 
	Airport addAirport(Airport airport);
    Optional<Airport> getAirportById(String airportCode);
	List<Airport> getAllAirports();
	void deleteAirport(String AirportCode);
	
}
