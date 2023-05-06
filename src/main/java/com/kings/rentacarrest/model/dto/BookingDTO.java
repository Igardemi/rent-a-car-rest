package com.kings.rentacarrest.model.dto;

import com.kings.rentacarrest.persistence.entity.User;
import com.kings.rentacarrest.persistence.entity.Vehicle;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Data
public class BookingDTO {

    private Long id;
    private Integer user;
    private Integer vehicle;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Double price;
}
