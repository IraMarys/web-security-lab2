package edu.pzks.security25.domain.service.impl;
import edu.pzks.security25.api.v1.request.CarRequest;
import edu.pzks.security25.domain.entity.Car;
import edu.pzks.security25.domain.repository.CarRepository;
import edu.pzks.security25.domain.service.CarService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository cars;
    public CarServiceImpl(CarRepository cars){ this.cars = cars; }
    @Override public Car create(CarRequest req){
        Car c = new Car();
        c.setBrand(req.brand);
        c.setModel(req.model);
        c.setPlateNumber(req.plateNumber);
        c.setDailyPrice(req.dailyPrice);
        return cars.save(c);
    }
    @Override public List<Car> list(){ return cars.findAll(); }
    @Override public void delete(UUID id){ cars.deleteById(id); }
}
