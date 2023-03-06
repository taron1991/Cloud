package com.example.eurekaclient2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NewController {


    @GetMapping("/name")
    public String getMessage(){
        return "from new Controller";
    }
}
