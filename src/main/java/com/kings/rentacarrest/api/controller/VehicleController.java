package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplVehicleService;
import com.kings.rentacarrest.persistence.entity.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicle")
public class VehicleController {
    private final ImplVehicleService VehicleService;

    @GetMapping
    public List<Vehicle> findAllVehicle() {
        return this.VehicleService.findAllVehicle();
    }

    @GetMapping("/{id}")
    public Vehicle findTaskById(@PathVariable("id") Long id) throws DefaultException {
        return this.VehicleService.findVehicleById(id);
    }

    @PostMapping("")
    public void updateTask(@RequestBody Vehicle vehicle) throws DefaultException {
        this.VehicleService.updateVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) throws DefaultException{
        return this.VehicleService.deleteVehicle(id);
    }
    @GetMapping("/available")
    public List<Vehicle> getAvailableVehicles(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return this.VehicleService.getAvailableVehicles(startDate, endDate);
    }

}
