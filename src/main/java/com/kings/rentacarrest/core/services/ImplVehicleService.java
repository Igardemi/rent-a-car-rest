package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.persistence.entity.Vehicle;
import com.kings.rentacarrest.persistence.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImplVehicleService implements IVehicleService{

    private final VehicleRepository vehicleRepository;
    @Override
    public List<Vehicle> findAllVehicle() {
        return this.vehicleRepository.findAll();
    }

    @Override
    public Vehicle findVehicleById(Long id) throws DefaultException {
        val optionalVehicle = this.vehicleRepository.findById(id);
        optionalVehicle.orElseThrow(() -> new DefaultException("Vehicle not found", HttpStatus.NO_CONTENT));
        return optionalVehicle.get();
    }

    @Override
    public boolean deleteVehicle(Long id) throws DefaultException {
        this.findVehicleById(id);
        this.vehicleRepository.deleteById(id);
        return true;
    }

    @Override
    public void updateVehicle(Vehicle vehicle) throws DefaultException {
        this.vehicleRepository.saveAndFlush(vehicle);
    }

    public List<Vehicle> freeVehicles(Object reserve){
        return this.vehicleRepository.freeVehicles(reserve);
    }
}
