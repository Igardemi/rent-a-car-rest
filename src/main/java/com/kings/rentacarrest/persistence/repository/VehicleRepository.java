package com.kings.rentacarrest.persistence.repository;

import com.kings.rentacarrest.persistence.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    /**
     *
     * @param params recibe un objeto con dos fechas, starDate y finalDate
     * @return una lista de vehicles libre para las fechas seleccionadas
     * SELECT *
     * FROM vehicle
     * WHERE id NOT IN (
     *     SELECT vehicle
     *     FROM booking
     *     WHERE startDate <= 2023-05-01
     *     AND endDate >= 2023-05-03
     * );
     */
    @Query(value = "SELECT * FROM vehicle WHERE id NOT IN (SELECT vehicle FROM booking WHERE start_date <= ?1 AND finish_date >= ?2)", nativeQuery = true)
    List<Vehicle> findAvailableVehicles(Date startDate, Date endDate);
}
