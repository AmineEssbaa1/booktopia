package com.example.booktopia.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.formLogin().loginPage("/login").defaultSuccessUrl("/").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/webjars/**").permitAll();
//        httpSecurity.authorizeHttpRequests().requestMatchers("/createAuthor").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/updateAuthor").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/saveAuthor").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/showAuthor").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/deleteAuthor").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/authorsList").hasAnyRole("ADMIN","USER");
//
//
//        httpSecurity.authorizeHttpRequests().requestMatchers("/createCategory").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/updateCategory").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/saveCategory").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/showCategory").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/deleteCategory").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/categoriesList").hasAnyRole("ADMIN","USER");
//
//
//        httpSecurity.authorizeHttpRequests().requestMatchers("/createPubHouse").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/updatePubHouse").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/savePubHouse").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/showPubHouse").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/deletePubHouse").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/pubHousesList").hasAnyRole("ADMIN","USER");
//
//        httpSecurity.authorizeHttpRequests().requestMatchers("/createBook").hasAnyRole("ADMIN","AUTHOR");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/updateBook").hasAnyRole("ADMIN","AUTHOR");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/saveBook").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/showBook").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/deleteBook").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/booksList").hasAnyRole("ADMIN","USER");
//
//        httpSecurity.authorizeHttpRequests().requestMatchers("/createReview").hasRole("USER");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/updateReview").hasAnyRole("USER");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/saveReview").hasRole("USER");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/showReview").hasRole("USER");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/deleteReview").hasRole("USER");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/reviewsList").hasAnyRole("ADMIN","AUTHOR");
//
//
//        httpSecurity.authorizeHttpRequests().requestMatchers("/createUser").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/updateUser").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/saveUser").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/showUser").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/deleteUser").hasRole("ADMIN");
//        httpSecurity.authorizeHttpRequests().requestMatchers("/usersList").hasRole("ADMIN");


        httpSecurity.authorizeHttpRequests().requestMatchers("/createAuthor","/updateAuthor","/saveAuthor", "/showAuthor", "/deleteAuthor",
                "/createCategory", "/updateCategory", "/saveCategory", "/showCategory", "/deleteCategory",
                "/createPubHouse", "/updatePubHouse", "/savePubHouse", "/showPubHouse", "/deletePubHouse",
                "/createBook", "/updateBook", "/saveBook", "/showBook", "/deleteBook",
                "/createReview", "/updateReview", "/saveReview", "/showReview", "/deleteReview",
                "/createUser", "/updateUser", "/saveUser", "/showUser", "/deleteUser", "/usersList").hasRole("ADMIN");


        httpSecurity.authorizeHttpRequests().requestMatchers("/authorsList",
                "/categoriesList",
                "/pubHousesList",
                "/booksList",
                "/reviewsList"
                ).hasAnyRole("ADMIN","USER","AUTHOR");


        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();

        httpSecurity.exceptionHandling().accessDeniedPage("/accessDenied");
        return httpSecurity.build();

    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new  InMemoryUserDetailsManager(
                User.withUsername("admin").password(passwordEncoder.encode("admin123")).roles("ADMIN").build(),
                User.withUsername("author").password(passwordEncoder.encode("author123")).roles("AUTHOR").build(),
                User.withUsername("user").password(passwordEncoder.encode("user123")).roles("USER").build()

        );
    }

}
