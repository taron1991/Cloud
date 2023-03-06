package com.example.eurikaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurikaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurikaClientApplication.class, args);
    }

}
