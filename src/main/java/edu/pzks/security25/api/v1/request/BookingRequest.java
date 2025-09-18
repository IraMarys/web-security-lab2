package edu.pzks.security25.api.v1.request;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;
public class BookingRequest {
    @NotNull public UUID carId;
    @NotNull public LocalDate fromDate;
    @NotNull public LocalDate toDate;
}
