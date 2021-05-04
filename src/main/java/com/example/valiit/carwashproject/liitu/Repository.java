package com.example.valiit.carwashproject.liitu;


import com.example.valiit.carwashproject.DTO.AccountJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void newAccountJoin(AccountJoin request) {

        String sql = "INSERT INTO customer(firstName, lastName, phone, email, username, password)" +
                " VALUES (:firstname, :lastname, :phone, :email, :username, :password)";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("firstname", request.getFirstName());
        paramMap.put("lastname", request.getLastName());
        paramMap.put("email", request.getEmail());
        paramMap.put("phone", request.getPhone());
        paramMap.put("username", request.getUsername());
        paramMap.put("password", request.getPassword());
        jdbcTemplate.update(sql, paramMap);
    }

    public boolean usernameExists(String username) {
        String usernameExists = "SELECT count(*) > 0 FROM customer WHERE username = :username";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("username", username);
        return jdbcTemplate.queryForObject(usernameExists, paramMap, Boolean.class);
    }

    public boolean emailExists(String email) {
        String emailExists = "SELECT count(*) > 0 FROM customer WHERE email = :email";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("email", email);
        return jdbcTemplate.queryForObject(emailExists, paramMap, Boolean.class);
    }

    public boolean phoneExists(String phone) {
        String phoneExists = "SELECT count(*) > 0 FROM customer WHERE phone = :phone";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("phone", phone);
        return jdbcTemplate.queryForObject(phoneExists, paramMap, Boolean.class);
    }

}
