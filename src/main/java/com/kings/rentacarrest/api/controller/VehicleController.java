package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplVehicleService;
import com.kings.rentacarrest.persistence.entity.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicle")
public class VehicleController {
    private final ImplVehicleService implVehicleService;

    @GetMapping
    public List<Vehicle> findAllVehicle() {
        return this.implVehicleService.findAllVehicle();
    }

    @GetMapping("/{id}")
    public Vehicle findTaskById(@PathVariable("id") Long id) throws DefaultException {
        return this.implVehicleService.findVehicleById(id);
    }

    @PostMapping("")
    public void updateTask(@RequestBody Vehicle vehicle) throws DefaultException {
        this.implVehicleService.updateVehicle(vehicle);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) throws DefaultException{
        return this.implVehicleService.deleteVehicle(id);
    }
    @PostMapping("/free")
    public List<Vehicle> freeVehicles(@RequestBody Object params){
        return this.implVehicleService.freeVehicles(params);
    }

}
