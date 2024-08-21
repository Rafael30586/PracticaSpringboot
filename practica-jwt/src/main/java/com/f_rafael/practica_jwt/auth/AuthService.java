package com.f_rafael.practica_jwt.auth;

import com.f_rafael.practica_jwt.jwt.JwtService;
import com.f_rafael.practica_jwt.user.Role;
import com.f_rafael.practica_jwt.user.User;
import com.f_rafael.practica_jwt.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        /*
        User user = user.builder() //Aca falta algo, me da error diciendo que user puede no estar instanciado
                .username(request.getUsername())
                .password(request.getPasswod())
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .country(request.getCountry())
                .role(Role.USER)
                .build();*/
        User user = new User();
        user.setFirstname(request.getFirstname());
        user.setUsername(request.getUsername());
        user.setPassword(request.getPasswod());
        user.setLastname(request.getLastname());
        user.setCountry(request.getCountry());
        user.setRole(Role.USER);

        userRepository.save(user);

        return AuthResponse.builder().token(jwtService.getToken(user)).build();
    }
}
