package com.f_rafael.practica_jwt.jwt;

import com.f_rafael.practica_jwt.user.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public String getToken(UserDetails user) {
        return null;
    }
}
