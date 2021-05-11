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
    public NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    public Service service;


    //http://localhost:9090/carWash/newAccountJoin
    //@CrossOrigin
    @PostMapping("api/public/carWash/newAccountJoin")
    public void newAccountJoin(@RequestBody AccountJoin request) {
        service.newAccountJoin(request);
    }
}
