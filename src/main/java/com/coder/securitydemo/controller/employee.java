package com.coder.securitydemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class employee {

    @GetMapping
    public String greeting(HttpServletRequest request) {
        return "Welcome to My Project : " + request.getSession().getId() ;
    }
}
