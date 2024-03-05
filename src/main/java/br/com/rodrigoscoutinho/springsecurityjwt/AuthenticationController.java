package br.com.rodrigoscoutinho.springsecurityjwt;

import org.springframework.web.bind.annotation.PostMapping;

public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("authenticate")
    public String authenticate() {
        return authenticationService.authenticate();
    }

}
