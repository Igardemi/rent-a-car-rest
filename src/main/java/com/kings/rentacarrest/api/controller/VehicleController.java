package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplVehicleService;
import com.kings.rentacarrest.persistence.entity.Vehicle;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(tags="Vehicle-controller",summary = "Get all vehicles", description = "This method return a list with all Vehicles object")
    public List<Vehicle> findAllVehicle() {
        return this.VehicleService.findAllVehicle();
    }

    @GetMapping("/{id}")
    @Operation(tags="Vehicle-controller",summary = "Get vehicle by id", description = "This method return a vehicles object with this id")
    public Vehicle findTaskById(@PathVariable("id") Long id) throws DefaultException {
        return this.VehicleService.findVehicleById(id);
    }

    @PostMapping("")
    @Operation(tags="Vehicle-controller",summary = "Add new vehicle or update", description = "This method return a list with all Vehicles object before update or created new vehicle")
    public List<Vehicle> updateTask(@RequestBody Vehicle vehicle) throws DefaultException {
        this.VehicleService.updateVehicle(vehicle);
        return findAllVehicle();
    }

    @DeleteMapping("/{id}")
    @Operation(tags="Vehicle-controller",summary = "Add new vehicle or update", description = "This method return a list with all Vehicles objects before delete the vehicle by id specified")
    public List<Vehicle> deleteById(@PathVariable("id") Long id) throws DefaultException{
        this.VehicleService.deleteVehicle(id);
        return findAllVehicle();
    }
    @GetMapping("/available")
    @Operation(tags="Vehicle-controller",summary = "Add new vehicle or update", description = "This method return a list with all Vehicles objects availables for dates introduced in the form")
    public List<Vehicle> getAvailableVehicles(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return this.VehicleService.getAvailableVehicles(startDate, endDate);
    }

}
