package com.example.valiit.carwashproject.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
    List<ServiceType> findAllBy();

}
