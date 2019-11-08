package com.fa.cai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fa.cai.dao")
public class CaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaiApplication.class, args);
    }

}
