package br.com.rodrigoscoutinho.springsecurityjwt;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;

public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("authenticate")
    public String authenticate(Authentication authentication) {
        return authenticationService.authenticate(authentication);
    }

}
