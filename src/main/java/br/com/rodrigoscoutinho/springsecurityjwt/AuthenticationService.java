package br.com.rodrigoscoutinho.springsecurityjwt;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.rodrigoscoutinho.springsecurityjwt.jwt.JwtService;

@Service
public class AuthenticationService {

    private final JwtService jwtService;

    public AuthenticationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String authenticate(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }

}
