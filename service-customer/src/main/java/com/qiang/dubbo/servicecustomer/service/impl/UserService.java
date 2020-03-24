package com.qiang.dubbo.servicecustomer.service.impl;

import com.qiang.dubbo.models.UserModel;
import com.qiang.dubbo.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements com.qiang.dubbo.servicecustomer.service.IUserService {

    @Reference
    IUserService userService;

    @Override
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }
}
