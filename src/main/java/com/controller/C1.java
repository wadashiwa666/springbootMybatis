package com.controller;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C1 {

    @Autowired
    private UserService userService;

    @RequestMapping("/aaa")
    @ResponseBody
    public String aaa() {
        return "aaa";
    }

    @RequestMapping("/users")
    @ResponseBody
    public String getAllUsers() {
        return userService.getAllUsers().toString();
    }
}
