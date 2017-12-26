package com.example.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value="/hello")
    public String hello(@RequestParam(name="name") String name){

        return "eureka-client1: hi "+name+",i am from port:" +port;
    }
}
