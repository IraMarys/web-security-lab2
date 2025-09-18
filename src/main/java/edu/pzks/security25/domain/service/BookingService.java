package edu.pzks.security25.domain.service;
import edu.pzks.security25.domain.entity.Booking;
import edu.pzks.security25.api.v1.request.BookingRequest;
public interface BookingService {
    Booking create(String userEmail, BookingRequest req);
}
