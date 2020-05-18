package com.cpg.fms.Flight.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpg.fms.Flight.model.Flight;
import com.cpg.fms.Flight.service.FlightServiceImpl;

@RestController
@RequestMapping("/flights")
@CrossOrigin(origins = "http://localhost:4200")

public class FlightController {

	@Autowired
	FlightServiceImpl flightService;
	
	@PostMapping("/addFlight")
	public ResponseEntity<Flight> addFlight(@Valid @RequestBody Flight flight) {
		flightService.addFlight(flight);
		return new ResponseEntity<Flight>(flight, HttpStatus.CREATED);
	}
	
	@GetMapping("/{flightNumber}")
	public ResponseEntity<Flight> getFlightById(@PathVariable int flightNumber) {

		Flight f = flightService.getFlightById(flightNumber);

		return new ResponseEntity<Flight>(f, HttpStatus.OK);
	}
	
	@GetMapping("/allFlights")
	public ResponseEntity<List<Flight>> getAllFlights() {
		List<Flight> allFlights = flightService.getAll();
		return new ResponseEntity<List<Flight>>(allFlights, HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<Flight> modifyFlight(@Valid @RequestBody Flight flight) {
		flightService.modifyFlight(flight);
		return new ResponseEntity<>(flight, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{flightNumber}")
	public ResponseEntity<Flight> deleteFlight(@Valid @PathVariable int flightNumber) {
		flightService.deleteFlight(flightNumber);
		return new ResponseEntity<Flight>(HttpStatus.OK);

	}



}
