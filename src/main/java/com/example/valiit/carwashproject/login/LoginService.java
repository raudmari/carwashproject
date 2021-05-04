package com.example.valiit.carwashproject.login;

import com.example.valiit.carwashproject.exceptions.ApplicationException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class LoginService {

    @Autowired
    private HibernateLoginRepository hibernateLoginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String logIn(LoginRequest loginRequest) {
        LoginHibernate getPasswordByUsername = hibernateLoginRepository.findByUsername(loginRequest.getUsername());
        String rawPassword = loginRequest.getPassword();
        String encodedPassword = getPasswordByUsername.getPassword();
        if (passwordEncoder.matches(rawPassword,encodedPassword)) {
            getPasswordByUsername.setLoginTime(LocalDateTime.now());
            hibernateLoginRepository.save(getPasswordByUsername);
            Date today = new Date();
            Date tokenExpirationDate = new Date(today.getTime() + 1000 * 60 * 60);
            JwtBuilder jwtBuilder = Jwts.builder()
                    .setExpiration(tokenExpirationDate)
                    .setIssuedAt(new Date())
                    .signWith(SignatureAlgorithm.HS256, "c2VjcmV0C")
                    .claim("username", loginRequest.getUsername());

            return jwtBuilder.compact();
        } else {
            throw new ApplicationException("Vale parool");
        }
    }

}
