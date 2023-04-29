package com.kings.rentacarrest.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name="user") @OneToOne
    private User user;
    @JoinColumn(name="vehicle") @OneToOne
    private Vehicle vehicle;
    private Date startDate;
    private Date finishDate;
    private Double price;


}
