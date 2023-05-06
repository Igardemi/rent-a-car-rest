package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplBookingService;
import com.kings.rentacarrest.model.dto.BookingDTO;
import com.kings.rentacarrest.persistence.entity.Booking;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {

    private final ImplBookingService bookingService;

    /**
     *
     * @param id recibe el id de un usuario
     * @return  una lista con todas las reservas reaizadas por el.
     */
    @GetMapping("/{id}")
    public List<Booking> findAllBookingByUserId(@PathVariable("id") Long id) {
        return this.bookingService.findAllByUser(id);
    }

    /**
     * Crear un reserva de alquiler
     * @param booking
     * @throws DefaultException
     */
    @PostMapping("")
    public void updateBooking(@RequestBody BookingDTO booking) throws DefaultException {
        this.bookingService.updateBooking(booking);
    }


}
