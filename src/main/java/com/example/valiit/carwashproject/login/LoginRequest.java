package com.example.valiit.carwashproject.login;

import java.time.LocalDateTime;

public class LoginRequest {
    private String email;
    private String password;
    private LocalDateTime login_time;

    public LocalDateTime getLogin_time() {
        return login_time;
    }

    public void setLogin_time(LocalDateTime login_time) {
        this.login_time = login_time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
