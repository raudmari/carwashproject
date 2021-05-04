package com.example.valiit.carwashproject.liitu;

import com.example.valiit.carwashproject.DTO.AccountJoin;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public void newAccountJoin(AccountJoin request) {

        repository.newAccountJoin(request);



    }


}
