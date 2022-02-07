package com.carara.jwtdemo.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/")
    public String home(){
        return "Welcome to the JWT demo.";
    }
}
