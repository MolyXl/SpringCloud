package com.provider.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mazhuli
 * @date 2020/3/17
 * @desc ${description}
 */
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hello() {
        String relust= restTemplate.getForObject("http://eureka-provider/hello", String.class);
        return relust;
    }
    public String hiError() {
        return "hi,sorry,error!";
    }
}
