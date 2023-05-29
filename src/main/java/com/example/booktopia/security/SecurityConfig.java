package com.example.booktopia.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.formLogin();
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        return httpSecurity.build();

    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new  InMemoryUserDetailsManager(
                User.withUsername("admin").password("{noop}admin123").roles("ADMIN","USER").build(),
                User.withUsername("author").password("{noop}author123").roles("AUTHOR").build(),
                User.withUsername("user").password("{noop}user123").roles("USER").build()

        );
    }

}
