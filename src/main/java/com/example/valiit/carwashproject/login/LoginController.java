package com.example.valiit.carwashproject.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    // http://localhost:9090/api/public/carWash/login
    @PostMapping("/api/public/carWash/login")
    public String logIn(@RequestBody LoginRequest loginRequest) {
        return loginService.logIn(loginRequest);
    }
}
