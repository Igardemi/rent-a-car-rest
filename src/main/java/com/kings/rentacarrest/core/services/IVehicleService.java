package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.persistence.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    /**
     *
     * @return devuelve una lista de entidades vehicle de la base de datos
     */
    public List<Vehicle> findAllVehicle();

    /**
     *
     * @param id tipo Long referencian al valor id de la entidad a localizar.
     * @return devuelve una entidad Vehicle.
     * @throws DefaultException "entity not found" si no encuentra una entidad Vehicle en la bd con ese id.
     */
    public Vehicle findVehicleById(final Long id) throws DefaultException;

    /**
     *
     * @param id representa identificador de la Entidad que se quiere eliminar.
     * @return devuelve true si se ha podido borrar la Entidad seleccionada.
     * @throws DefaultException "entity not found" si no encuentra una entidad en la bd con ese id.
     */
    public boolean deleteVehicle(final Long id) throws DefaultException;

    /**
     *
     * @param vehicle recibe una Entidad para crear o actualizar
     */
    public void updateVehicle(Vehicle vehicle) throws DefaultException;
}
