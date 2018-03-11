package com.lyn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //允许发现服务机
public class HelloAppicationMain {

    public static void main(String[] args) {
        SpringApplication.run(HelloAppicationMain.class,args);
    }
}
