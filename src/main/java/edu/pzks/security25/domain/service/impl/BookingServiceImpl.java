package edu.pzks.security25.domain.service.impl;
import edu.pzks.security25.api.v1.request.BookingRequest;
import edu.pzks.security25.domain.entity.Booking;
import edu.pzks.security25.domain.entity.Car;
import edu.pzks.security25.domain.entity.User;
import edu.pzks.security25.domain.repository.BookingRepository;
import edu.pzks.security25.domain.repository.CarRepository;
import edu.pzks.security25.domain.repository.UserRepository;
import edu.pzks.security25.domain.service.BookingService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookings;
    private final CarRepository cars;
    private final UserRepository users;

    public BookingServiceImpl(BookingRepository bookings, CarRepository cars, UserRepository users){
        this.bookings = bookings; this.cars = cars; this.users = users;
    }

    @Override
    public Booking create(String userEmail, BookingRequest req) {
        User u = users.findByEmail(userEmail).orElseThrow();
        Car c = cars.findById(req.carId).orElseThrow();
        // TODO: add proper overlap check via repository. Here simplified.
        long days = Math.max(1, ChronoUnit.DAYS.between(req.fromDate, req.toDate));
        Booking b = new Booking();
        b.setUser(u); b.setCar(c);
        b.setFromDate(req.fromDate); b.setToDate(req.toDate);
        b.setTotalPrice(c.getDailyPrice().multiply(BigDecimal.valueOf(days)));
        return bookings.save(b);
    }
}
