package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.model.dto.BookingDTO;
import com.kings.rentacarrest.model.mapper.BookingDTOtoEntity;
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
    private final BookingDTOtoEntity bookingMapper;
    @Override
    public List<Booking> findAllBooking() {
        return this.bookingRepository.findAll();
    }

    @Override
    public List<Booking> findAllByUser(Long id){
        return this.bookingRepository.findAllByUserId(id);
    }

    @Override
    public boolean deleteBooking(Long id) throws DefaultException {
        this.findBookingById(id);
        this.bookingRepository.deleteById(id);
        return true;
    }

    @Override
    public void updateBooking(BookingDTO bookingDTO) throws DefaultException {
        Booking booking = bookingMapper.map(bookingDTO);
        this.bookingRepository.saveAndFlush(booking);
    }

    @Override
    public void findBookingById(Long id) {
        this.bookingRepository.findById(id);
    }
}
