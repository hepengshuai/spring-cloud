package com.hps.client.controller;

import com.hps.client.bean.User;
import com.hps.client.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final HelloService helloService;

    public UserController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public List<User> list() {
        return helloService.list();
    }
}
