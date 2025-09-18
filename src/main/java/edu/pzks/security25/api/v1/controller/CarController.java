package edu.pzks.security25.api.v1.controller;
import edu.pzks.security25.api.v1.request.CarRequest;
import edu.pzks.security25.domain.entity.Car;
import edu.pzks.security25.domain.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {
    private final CarService cars;
    public CarController(CarService cars){ this.cars = cars; }

    @PostMapping
    public ResponseEntity<Car> create(@Validated @RequestBody CarRequest req){
        return ResponseEntity.ok(cars.create(req));
    }

    @GetMapping
    public ResponseEntity<List<Car>> list(){ return ResponseEntity.ok(cars.list()); }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){ cars.delete(id); return ResponseEntity.noContent().build(); }
}
