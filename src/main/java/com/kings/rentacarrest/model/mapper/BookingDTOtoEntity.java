package com.kings.rentacarrest.model.mapper;

import com.kings.rentacarrest.model.dto.BookingDTO;
import com.kings.rentacarrest.persistence.entity.Booking;
import com.kings.rentacarrest.persistence.repository.UserRepository;
import com.kings.rentacarrest.persistence.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingDTOtoEntity implements IMapper<BookingDTO, Booking> {

    private final UserRepository userRepository;
    private final VehicleRepository vehicleRepository;
    @Override
    public Booking map(BookingDTO bookingDTO) {
        Booking booking = new Booking();
        booking.setId(null);
        booking.setUser(userRepository.getById(Long.valueOf(bookingDTO.getUser())));
        booking.setVehicle(vehicleRepository.getById(Long.valueOf(bookingDTO.getVehicle())));
        booking.setStartDate(bookingDTO.getStartDate());
        booking.setFinishDate(bookingDTO.getEndDate());
        booking.setPrice(bookingDTO.getPrice());
        return booking;
    }
}
