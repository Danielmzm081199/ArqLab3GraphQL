package com.udea.lab3GraphQL.repository;

import com.udea.lab3GraphQL.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}