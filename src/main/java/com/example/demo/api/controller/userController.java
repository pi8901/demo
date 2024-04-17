package com.example.demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.api.model.user;
import com.example.demo.service.userService;

@RestController
public class userController {

    private userService userService;

    @Autowired
    public userController(userService userService)
    {
        this.userService = userService;
    }
    
    @GetMapping("/user")
    public user getUser(@RequestParam Integer id)
    {
        return userService.getUser(id);
    }
}
