package com.hps.provider.controller;

import com.hps.provider.bean.User;
import com.hps.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }
}
