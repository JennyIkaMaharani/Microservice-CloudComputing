package com.project.layanglayangserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LayangLayangServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayangLayangServerApplication.class, args);
    }

}
