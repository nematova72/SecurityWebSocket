package com.example.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/accaount" )
    public String getAccount(){
        return "account";
    }

    @GetMapping("/user")
    public ResponseEntity getUser(Principal principal){
        return ResponseEntity.ok(principal);
    }
}
