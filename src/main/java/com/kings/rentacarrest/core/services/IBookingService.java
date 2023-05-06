package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.model.dto.BookingDTO;
import com.kings.rentacarrest.persistence.entity.Booking;

import java.util.List;

public interface IBookingService {
    /**
     *
     * @return devuelve una lista de bookings de la base de datos
     */
    public List<Booking> findAllBooking();

    /**
     *
     * @param id tipo Long referencian al valor id de un usuario.
     * @return devuelve una lista de entidades booking.
     * @throws DefaultException "entity not found" si no encuentra una entidad booking en la bd con ese id.
     */
    public List<Booking> findAllByUser(final Long id);

    /**
     *
     * @param id representa identificador de la Entidad que se quiere eliminar.
     * @return devuelve true si se ha podido borrar la Entidad seleccionada.
     * @throws DefaultException "entity not found" si no encuentra una entidad en la bd con ese id.
     */
    public boolean deleteBooking(final Long id) throws DefaultException;

    /**
     *
     * @param booking recibe un DTO de booking, lo transforma en entidad para enviar al repositorio, este método sirve tanto para para crear como actualizar
     */
    public void updateBooking(BookingDTO booking) throws DefaultException;

    /**
     *
     * @param id recibe un id y localiza la reserva
     */
    void findBookingById(Long id);
}
