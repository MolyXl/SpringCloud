package com.client.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mazhuli
 * @date 2020/3/17
 * @desc ${description}
 */
@RestController
@RefreshScope
public class Controller {

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hello")
    public String hello() {
        return hello;
    }
}
