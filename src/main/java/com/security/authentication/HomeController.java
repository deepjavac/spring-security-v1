package com.security.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String homePage(){
        return "Welcome to Home page";
    }

    @GetMapping("/user")
    public String userPage(){
        return "Welcome to User page";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "Welcome to Admin page";
    }
}
