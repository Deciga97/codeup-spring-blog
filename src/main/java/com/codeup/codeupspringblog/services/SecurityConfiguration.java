package com.codeup.codeupspringblog.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Security;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private UserDetailsLoader userLoader;

    public SecurityConfiguration(UserDetailsLoader usersLoader) {
        this.usersLoader = usersLoader;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        /* Login Configuration */
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/ads")
                // allow all users to vist /login
                .permitAll()

                /* Logout Configuration */
                .and()
                // provide a logout method
                .logout()
                // When a post request is made to /logout, redirect to /login?logout (login page)
                .logoutSuccessUrl("/login?logout")
                .and()
                /* Pages that can be viewed without loggin in */
                    // a;;pw requests to the following:
                .authorizeHttpRequests(

                )
                . requestMatchers("/", "/ads") // anyone can vist the home oage and the ads index page.
                . permitAll()
                /* pages that need a logged in user */
        // allow requests to the following:
                .authorizeHttpRequests()
                .requestMatchers("/ads/create, /ads/{id}/edit", "/ads/{id}")


    }
}
