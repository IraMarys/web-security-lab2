package edu.pzks.security25.domain.service;
import edu.pzks.security25.domain.entity.Car;
import edu.pzks.security25.api.v1.request.CarRequest;
import java.util.List;
import java.util.UUID;
public interface CarService {
    Car create(CarRequest req);
    List<Car> list();
    void delete(UUID id);
}
