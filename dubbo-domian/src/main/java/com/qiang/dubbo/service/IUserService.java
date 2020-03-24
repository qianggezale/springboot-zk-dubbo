package com.qiang.dubbo.service;

import com.qiang.dubbo.models.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> getUsers();
}
