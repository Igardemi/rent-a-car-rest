package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplBookingService;
import com.kings.rentacarrest.core.services.ImplVehicleService;
import com.kings.rentacarrest.persistence.entity.Booking;
import com.kings.rentacarrest.persistence.entity.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {

    private final ImplBookingService bookingService;

    @GetMapping
    public List<Booking> findAllVehicle() {
        return this.bookingService.findAllBooking();
    }

    /**
     * Crear un reserva de alquiler
     * @param booking
     * @throws DefaultException
     */
    @PostMapping("")
    public void updateTask(@RequestBody Booking booking) throws DefaultException {
        this.bookingService.updateBooking(booking);
    }
}
