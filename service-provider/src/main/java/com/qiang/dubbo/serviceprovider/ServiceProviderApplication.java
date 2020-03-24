package com.qiang.dubbo.serviceprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan({"com.qiang.dubbo.serviceprovider.dao"})
public class ServiceProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceProviderApplication.class, args);
    }

}
