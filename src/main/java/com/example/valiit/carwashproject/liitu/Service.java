package com.example.valiit.carwashproject.liitu;

import com.example.valiit.carwashproject.DTO.AccountJoin;
import com.example.valiit.carwashproject.exceptions.ApplicationException;
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

//        if (repository.usernameExists(request.getUsername())) {
//            throw new ApplicationException("User already exists");
//        }
        if (repository.phoneExists(request.getPhone())) {
            throw new ApplicationException("Phone number already exists");
        }
        if (repository.emailExists(request.getEmail())) {
            throw new ApplicationException("Email already exists");
        }
        repository.newAccountJoin(request);

    }
}
