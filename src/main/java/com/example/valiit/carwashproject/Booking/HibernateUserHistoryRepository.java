package com.example.valiit.carwashproject.Booking;

import com.example.valiit.carwashproject.DTO.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HibernateUserHistoryRepository extends JpaRepository<UserHistoryHibernate,Integer> {
    List<UserHistoryHibernate> getAllByCustomerId(Integer customerId);
}
