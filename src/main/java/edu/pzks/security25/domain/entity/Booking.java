package edu.pzks.security25.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Car car;

    private LocalDate fromDate;
    private LocalDate toDate;
    private BigDecimal totalPrice;

    @Enumerated(EnumType.STRING)
    private Status status = Status.CREATED;
    public enum Status { CREATED, CONFIRMED, CANCELED }

    // getters/setters omitted for brevity
}
