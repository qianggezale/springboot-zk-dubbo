package com.qiang.dubbo.models;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class UserModel implements Serializable {
    private long userId;
    private String name;
    private int age;
    private Date createTime;
}
