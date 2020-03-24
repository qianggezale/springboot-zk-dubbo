package com.qiang.dubbo.serviceprovider.dao;

import com.qiang.dubbo.models.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserMapper {
    List<UserModel> getUsers();
}
