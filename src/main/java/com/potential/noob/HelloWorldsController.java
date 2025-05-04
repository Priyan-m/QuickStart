package com.potential.noob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldsController {
    @GetMapping(path = "/hello")
    public String HellWorld(){
        return "VASU GOT FIRED";
    }
}
