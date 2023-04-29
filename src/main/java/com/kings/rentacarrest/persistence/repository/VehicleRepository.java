package com.kings.rentacarrest.persistence.repository;

import com.kings.rentacarrest.persistence.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    /**
     *
     * @param params recibe un objeto con dos fechas, starDate y finalDate
     * @return una lista de vehicles libre para las fechas seleccionadas
     */
    default List<Vehicle> freeVehicles(Object params){
        return findAll();
    };
}
