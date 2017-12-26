package com.example.servicefeign.controller;

import com.example.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value="/hello")
    public String hello(String name){
        return helloService.hello(name);
    }
}
