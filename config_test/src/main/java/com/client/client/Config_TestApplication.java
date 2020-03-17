package com.client.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Config_TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config_TestApplication.class, args);
    }


}
