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
                " VALUES (:firstname, :lastname, :email, :phone, :username, :password)";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("firstname", request.getFirstName());
        paramMap.put("lastname", request.getLastName());
        paramMap.put("email", request.getEmail());
        paramMap.put("phone", request.getPhone());
        paramMap.put("username", request.getUsername());
        paramMap.put("password", request.getPassword());
        jdbcTemplate.update(sql, paramMap);
    }



}
