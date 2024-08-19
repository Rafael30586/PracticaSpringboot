package com.f_rafael.practica_jwt.auth;

import com.f_rafael.practica_jwt.jwt.JwtService;
import com.f_rafael.practica_jwt.user.Role;
import com.f_rafael.practica_jwt.user.User;
import com.f_rafael.practica_jwt.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        User user = user.builder() //Aca falta algo, me error diciendo que user puede no estar instanciado
                .username(request.getUsername())
                .password(request.getPasswod())
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        userRepository.save(user);

        return AuthResponse.builder().token(jwtService.getToken(user)).build();
    }
}
