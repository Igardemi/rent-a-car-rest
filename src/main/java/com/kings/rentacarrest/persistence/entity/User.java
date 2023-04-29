package com.kings.rentacarrest.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Date bornDate;
    private Boolean admin;
    private String nif;
    private Date dateLicenseValid;
}
