package com.qiang.dubbo.servicecustomer.controller;

import com.qiang.dubbo.models.UserModel;
import com.qiang.dubbo.servicecustomer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/user/getusers")
    public List<UserModel> getUsers() {

        return userService.getUsers();

    }
}
