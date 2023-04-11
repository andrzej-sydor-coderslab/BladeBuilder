package com.example.bladebuilder.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime time;
    private String thickness;
    private String dimensionsWithQuantity;
    private String userName;

}