package com.example.valiit.carwashproject.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface WashStationRepository extends JpaRepository<WashStation, Integer> {
      List<WashStation> findAllBy();

}
