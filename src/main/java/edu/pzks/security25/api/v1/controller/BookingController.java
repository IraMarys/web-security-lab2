package edu.pzks.security25.api.v1.controller;
import edu.pzks.security25.api.v1.request.BookingRequest;
import edu.pzks.security25.domain.entity.Booking;
import edu.pzks.security25.domain.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {
    private final BookingService bookings;
    public BookingController(BookingService bookings){ this.bookings = bookings; }

    @PostMapping
    public ResponseEntity<Booking> create(@Validated @RequestBody BookingRequest req){
        // TODO: fetch user from SecurityContext and pass email
        String userEmail = "user@example.com";
        return ResponseEntity.ok(bookings.create(userEmail, req));
    }
}
