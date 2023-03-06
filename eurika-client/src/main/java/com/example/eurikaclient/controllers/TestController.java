package com.example.eurikaclient.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value(value = "${eureka.instance.instance-id}")
    public String port;

    @GetMapping("/test")
    public String string(){
        return "string "+port;
    }
}
