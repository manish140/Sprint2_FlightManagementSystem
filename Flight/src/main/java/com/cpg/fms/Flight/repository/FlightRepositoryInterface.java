package com.cpg.fms.Flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cpg.fms.Flight.model.Flight;
@Repository
public interface FlightRepositoryInterface extends JpaRepository<Flight, Integer>{
@Query("SELECT f FROM Flight f WHERE flightNumber = ?1")
public Flight getFlight(int flightNumber);
}
