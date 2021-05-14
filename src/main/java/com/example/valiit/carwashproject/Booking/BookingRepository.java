package com.example.valiit.carwashproject.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    Optional<Booking> findByDateTimeAndWashStationId(LocalDateTime dateTime, Integer washStationId);
    List<Booking> getAllByCustomerId(Integer customerId);


}
