package com.kings.rentacarrest.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carLicense;
    private String make;
    private String model;
    private String transmission;
    private String image;
    private Integer power;
    private String type;
    private Float priceDay;

}
