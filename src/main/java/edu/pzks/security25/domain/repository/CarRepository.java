package edu.pzks.security25.domain.repository;
import edu.pzks.security25.domain.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface CarRepository extends JpaRepository<Car, UUID> { }
