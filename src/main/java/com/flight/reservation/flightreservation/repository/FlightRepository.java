package com.flight.reservation.flightreservation.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight.reservation.flightreservation.model.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long>{
	
	
	 @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity ")
	    List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to);

	Optional<Flight> findById(Long flightId);

}
