package com.gorakhcodes.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public static String hello(){
        return "Hello User";
    }
    @GetMapping("/")
    public static String home(){
        return "<h1> Welcome to User Management Service </h1>";
    }

}
