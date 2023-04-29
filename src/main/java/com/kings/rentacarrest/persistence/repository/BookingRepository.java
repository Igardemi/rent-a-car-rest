package com.kings.rentacarrest.persistence.repository;

import com.kings.rentacarrest.persistence.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
