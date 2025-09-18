package edu.pzks.security25.api.v1.request;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
public class CarRequest {
    @NotBlank public String brand;
    @NotBlank public String model;
    @NotBlank public String plateNumber;
    @NotNull @Positive public BigDecimal dailyPrice;
}
