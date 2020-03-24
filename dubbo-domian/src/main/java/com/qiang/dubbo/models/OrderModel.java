package com.qiang.dubbo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class OrderModel implements Serializable {
    private long orderId;
    private String adress;
    private double price;
    private Date createTime;
}
