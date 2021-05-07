package com.example.valiit.carwashproject.servicetype;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HibernateServiceTypeRepository extends JpaRepository<ServiceTypeHibernate, Integer> {
    List<ServiceTypeHibernate> findAllBy();
}
