package com.example.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client1",fallback = SchedualServiceHiHystric.class)
public interface HelloService {

    @RequestMapping(value="/hello")
    public String hello(@RequestParam(name="name") String name);
}
