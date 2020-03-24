package com.qiang.dubbo.serviceprovider.service.impl;

import com.qiang.dubbo.models.UserModel;
import com.qiang.dubbo.service.IUserService;
import com.qiang.dubbo.serviceprovider.dao.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@org.apache.dubbo.config.annotation.Service
@Service
public class UserService implements IUserService {

    @Autowired
    IUserMapper userMapper;

    @Override
    public List<UserModel> getUsers() {

//        return new ArrayList<>();
        return userMapper.getUsers();
    }
}
