package com.qiang.dubbo.servicecustomer.controller;

import com.qiang.dubbo.models.OrderModel;
import com.qiang.dubbo.servicecustomer.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    IOrderService orderService;

    @RequestMapping("/order/getorders")
    public List<OrderModel> getOrders() {

//        return new ArrayList<>();
        return orderService.getOrders();

    }

}
