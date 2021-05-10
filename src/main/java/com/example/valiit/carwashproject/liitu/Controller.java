package com.example.valiit.carwashproject.liitu;


import com.example.valiit.carwashproject.DTO.AccountJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {


    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private Service service;


    //http://localhost:9090/carWash/newAccountJoin
    @PostMapping("/api/carWash/newAccountJoin")
    public void newAccountJoin(@RequestBody AccountJoin request) {
        service.newAccountJoin(request);
    }
}
