package edu.pzks.security25.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue
    private UUID id;

    private String brand;
    private String model;
    @Column(unique = true)
    private String plateNumber;
    private BigDecimal dailyPrice;

    @Enumerated(EnumType.STRING)
    private Status status = Status.AVAILABLE;
    public enum Status { AVAILABLE, RENTED, SERVICE }

    // getters/setters omitted for brevity
}
