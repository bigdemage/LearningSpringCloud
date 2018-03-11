package com.lyn.Controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
private final Logger logger =Logger.getLogger(HelloController.class);
    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String hello(){
        ServiceInstance si =client.getLocalServiceInstance();
        logger.info("host:"+si.getHost()+"  service_id:"+si.getServiceId());
        return "hello lyn";
    }
}
