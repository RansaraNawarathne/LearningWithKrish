package com.malindu.auth.authserverold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthServerOldApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerOldApplication.class, args);
    }

}
