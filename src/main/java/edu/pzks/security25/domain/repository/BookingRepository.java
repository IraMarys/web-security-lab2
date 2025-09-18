package edu.pzks.security25.domain.repository;
import edu.pzks.security25.domain.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
public interface BookingRepository extends JpaRepository<Booking, UUID> {
    List<Booking> findByCar_IdAndFromDateLessThanEqualAndToDateGreaterThanEqual(UUID carId, LocalDate to, LocalDate from);
}
