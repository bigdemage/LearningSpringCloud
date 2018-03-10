package com.lyn;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationMain {
    public static void main(String[] args) {
        System.out.println("222");
    }
}
