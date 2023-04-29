package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
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
     * @param id tipo Long referencian al valor id de la entidad a localizar.
     * @return devuelve una entidad booking.
     * @throws DefaultException "entity not found" si no encuentra una entidad booking en la bd con ese id.
     */
    public Booking findBookingById(final Long id) throws DefaultException;

    /**
     *
     * @param id representa identificador de la Entidad que se quiere eliminar.
     * @return devuelve true si se ha podido borrar la Entidad seleccionada.
     * @throws DefaultException "entity not found" si no encuentra una entidad en la bd con ese id.
     */
    public boolean deleteBooking(final Long id) throws DefaultException;

    /**
     *
     * @param booking recibe una Entidad booking para crear o actualizar
     */
    public void updateBooking(Booking booking) throws DefaultException;
}
