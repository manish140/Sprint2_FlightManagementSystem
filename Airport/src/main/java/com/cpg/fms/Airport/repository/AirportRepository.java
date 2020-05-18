package com.cpg.fms.Airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cpg.fms.Airport.model.Airport;


@Repository
public interface AirportRepository extends JpaRepository<Airport,String> {

}
