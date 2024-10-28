package com.udea.lab3GraphQL.repository;

import com.udea.lab3GraphQL.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}