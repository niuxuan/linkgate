package com.angogo.ht.linkgate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@MapperScan("com.angogo.ht.linkgate.mapper")
public class LinkgateApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkgateApplication.class, args);
    }

}

