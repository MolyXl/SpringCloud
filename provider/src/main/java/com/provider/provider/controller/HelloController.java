package com.provider.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mazhuli
 * @date 2020/3/17
 * @desc ${description}
 */
@RestController
public class HelloController {

   @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
