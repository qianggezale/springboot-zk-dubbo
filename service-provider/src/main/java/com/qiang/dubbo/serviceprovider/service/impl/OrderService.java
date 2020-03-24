package com.qiang.dubbo.serviceprovider.service.impl;

import com.qiang.dubbo.models.OrderModel;
import com.qiang.dubbo.service.IOrderService;
import com.qiang.dubbo.serviceprovider.dao.IOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@org.apache.dubbo.config.annotation.Service
@Service
public class OrderService implements IOrderService {

    @Autowired
    IOrderMapper orderMapper;

    @Override
    public List<OrderModel> getOrders() {

//        return new ArrayList<>();
        return orderMapper.getOrders();
    }
}
