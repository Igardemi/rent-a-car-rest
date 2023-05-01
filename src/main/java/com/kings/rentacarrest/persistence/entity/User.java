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
    @Temporal(TemporalType.DATE)
    private Date bornDate;
    private Boolean admin;
    private String email;
    private String nif;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date dateLicenseValid;
}
