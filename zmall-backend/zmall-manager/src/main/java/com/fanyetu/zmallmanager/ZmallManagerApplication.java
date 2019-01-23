package com.fanyetu.zmallmanager;

import com.fanyetu.common.result.Result;
import com.fanyetu.zmallmanager.goods.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zhanghaonan
 * @date 2019/1/23
 */
@SpringBootApplication
@EnableDiscoveryClient
// 开启Fegin
@EnableFeignClients
@MapperScan(basePackages = "com.fanyetu.zmallgoods")
public class ZmallManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ZmallManagerApplication.class, args);
    }

    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @Override
    public void run(String... args) throws Exception {
        Result goodCategories = goodsCategoryService.getGoodCategories();
        System.out.println(goodCategories);
    }
}
