package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;


/**
 * @author <a href="mailto:kgrodzicki@gmail.com">Krzysztof Grodzicki</a> 15/01/16.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("user").and()
                .withUser("admin").password("password").roles("admin");
    }

    /**
     * We disable all session functionality in spring security (including the csrf check). We have a stateless api.
     * We are authentication with http-basic for all our api-endpoints.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().sessionManagement().sessionCreationPolicy(STATELESS)
                .and()
                .httpBasic().realmName("realm").and()
                .authorizeRequests()
                .antMatchers("/**").access("hasRole('user')")
                .antMatchers("/admin/**").access("hasRole('admin')");
    }
}
