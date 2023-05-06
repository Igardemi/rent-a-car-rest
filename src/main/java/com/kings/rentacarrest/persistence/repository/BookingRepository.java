package com.kings.rentacarrest.persistence.repository;

import com.kings.rentacarrest.persistence.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
   public List<Booking> findAllByUserId(Long id);
}
