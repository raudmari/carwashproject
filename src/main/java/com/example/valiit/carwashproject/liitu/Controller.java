package com.example.valiit.carwashproject.liitu;


import com.example.valiit.carwashproject.DTO.AccountJoin;
import com.example.valiit.carwashproject.DTO.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {


    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private Service service;


    //http://localhost:9090/carWash/newAccountJoin
    @PostMapping("carWash/newAccountJoin")
    public void newAccountJoin(@RequestBody AccountJoin request) {
        service.newAccountJoin(request);
    }

    //http://localhost:9090/carWash/accountHistory/
    @GetMapping("carWash/accountHistory/{username}")
    public List<History> getAccountHistory(@PathVariable("username") String username) {

        return service.getAccountHistory(username);
    }
}
