package com.qiang.dubbo.servicecustomer.service.impl;

import com.qiang.dubbo.models.OrderModel;
import com.qiang.dubbo.service.IOrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements com.qiang.dubbo.servicecustomer.service.IOrderService {

    @Reference
    private IOrderService orderService;

    @Override
    public List<OrderModel> getOrders() {
        return orderService.getOrders();
    }
}
