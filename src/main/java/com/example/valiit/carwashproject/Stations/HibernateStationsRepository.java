package com.example.valiit.carwashproject.Stations;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HibernateStationsRepository extends JpaRepository<StationsHibernate, Integer> {
    List<StationsHibernate> findAllBy();

}
