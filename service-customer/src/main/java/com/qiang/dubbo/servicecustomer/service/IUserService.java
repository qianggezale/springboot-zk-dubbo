package com.qiang.dubbo.servicecustomer.service;

import com.qiang.dubbo.models.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> getUsers();
}
