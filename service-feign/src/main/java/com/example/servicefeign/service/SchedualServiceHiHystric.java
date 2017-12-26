package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements  HelloService {
    @Override
    public String hello(String name) {
        return "sorry "+name;
    }
}
