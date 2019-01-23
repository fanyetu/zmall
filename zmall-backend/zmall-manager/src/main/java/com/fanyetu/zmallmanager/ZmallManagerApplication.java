package com.fanyetu.zmallmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhanghaonan
 * @date 2019/1/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZmallManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallManagerApplication.class, args);
    }
}
