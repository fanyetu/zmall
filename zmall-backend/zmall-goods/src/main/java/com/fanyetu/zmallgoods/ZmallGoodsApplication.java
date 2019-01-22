package com.fanyetu.zmallgoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 商品模块
 *
 * @author zhanghaonan
 * @date 2019/1/20
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.fanyetu.zmallgoods.mapper")
public class ZmallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmallGoodsApplication.class, args);
    }
}
