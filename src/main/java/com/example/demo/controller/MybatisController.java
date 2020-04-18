package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class MybatisController {

    @Autowired
    private UserService userService;

    @RequestMapping("m_add")
    public User m_add() {

        User user = new User();
        user.setName("ww1");
        user.setTel("182");

        userService.insert(user);

        return user;
    }
}
