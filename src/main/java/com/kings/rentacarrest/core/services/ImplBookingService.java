package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.persistence.entity.Booking;
import com.kings.rentacarrest.persistence.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImplBookingService implements IBookingService{
    private final BookingRepository bookingRepository;
    @Override
    public List<Booking> findAllBooking() {
        return this.bookingRepository.findAll();
    }

    @Override
    public Booking findBookingById(Long id) throws DefaultException {
        val optionalBooking = this.bookingRepository.findById(id);
        optionalBooking.orElseThrow(() -> new DefaultException("Booking not found", HttpStatus.NO_CONTENT));
        return optionalBooking.get();
    }

    @Override
    public boolean deleteBooking(Long id) throws DefaultException {
        this.findBookingById(id);
        this.bookingRepository.deleteById(id);
        return true;
    }

    @Override
    public void updateBooking(Booking booking) throws DefaultException {
        this.bookingRepository.saveAndFlush(booking);
    }
}
