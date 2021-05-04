package com.example.valiit.carwashproject.liitu;

import com.example.valiit.carwashproject.DTO.AccountJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private Repository repository;

    public void newAccountJoin(AccountJoin request) {

        String encodedPassword = passwordEncoder.encode(request.getPassword());
        request.setPassword(encodedPassword);

        repository.newAccountJoin(request);

    }


}
