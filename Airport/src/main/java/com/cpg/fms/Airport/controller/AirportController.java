package com.cpg.fms.Airport.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpg.fms.Airport.model.Airport;
import com.cpg.fms.Airport.service.AirportServiceInterface;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/airport")
public class AirportController {
    
	@Autowired
	AirportServiceInterface airportService;
	
	@PostMapping("/addAirport")
	public ResponseEntity<Airport> addAirport(@Valid @RequestBody Airport airport){
		 airportService.addAirport(airport);
		return new ResponseEntity<Airport>(HttpStatus.CREATED);
	}
	
	@GetMapping("/airport/{airportCode}")
	public ResponseEntity<Optional<Airport>> getAirportById(@Valid @PathVariable String airportCode){
		Optional<Airport> airport=airportService.getAirportById(airportCode);
		return new ResponseEntity<Optional<Airport>>(airport,HttpStatus.OK);
	}
	
	@GetMapping("/allAirports")
	public ResponseEntity<List<Airport>> getAllAirprots(){
		List<Airport> airports=airportService.getAllAirports();
		return new ResponseEntity<List<Airport>>(airports,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{airportCode}")
	public ResponseEntity<Airport> deleteAirport(@Valid @PathVariable String airportCode){
		airportService.deleteAirport(airportCode);
		return new ResponseEntity<Airport>(HttpStatus.OK);
	}
}