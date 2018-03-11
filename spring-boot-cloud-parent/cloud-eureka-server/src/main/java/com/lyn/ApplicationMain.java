package com.lyn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationMain.class).web(true).run(args);
    }
}
