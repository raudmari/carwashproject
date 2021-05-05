package com.example.valiit.carwashproject.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WashStationRepository extends JpaRepository<WashStation, Integer> {
    List<WashStation> getById(Integer id);
}
