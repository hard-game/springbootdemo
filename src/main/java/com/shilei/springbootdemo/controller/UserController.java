package com.shilei.springbootdemo.controller;

import com.shilei.springbootdemo.entity.User;
import com.shilei.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }

    @RequestMapping("/get")
    public String get(){
        User u=userService.find(1);
        return u.toString();
    }


}
