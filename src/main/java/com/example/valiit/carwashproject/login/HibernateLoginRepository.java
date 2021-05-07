package com.example.valiit.carwashproject.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HibernateLoginRepository extends JpaRepository<LoginHibernate, Integer> {
    LoginHibernate findByEmail (String email);
}
