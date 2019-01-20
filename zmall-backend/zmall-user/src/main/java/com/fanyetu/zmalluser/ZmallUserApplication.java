package com.fanyetu.zmalluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallUserApplication.class, args);
    }

}

