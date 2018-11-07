package com.hps.client.service;

import com.hps.client.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "spring-cloud-gateway")
@Component
public interface HelloService {

    @GetMapping("/provider/hello")
    String hello();

    @PostMapping("/provider/user")
    User add(@RequestBody User user);

    @GetMapping("/provider/user")
    List<User> list();
}
