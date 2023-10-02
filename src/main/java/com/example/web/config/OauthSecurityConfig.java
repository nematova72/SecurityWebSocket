package com.example.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class OauthSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain( HttpSecurity security) throws Exception {
        return security
                .authorizeHttpRequests(auth ->{
                    auth.requestMatchers("/api/hello").permitAll();
                    auth.requestMatchers("/api/account").authenticated();
                })
                .formLogin(withDefaults())
                .oauth2Login(withDefaults())
                .build();
    }
}
