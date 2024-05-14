package com.dario.holaspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllController {

    @GetMapping("/")
    public String hola(){
        return "hola";
    }
}
