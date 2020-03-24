package com.qiang.dubbo.service;

import com.qiang.dubbo.models.OrderModel;

import java.util.List;

public interface IOrderService {

    List<OrderModel> getOrders();

}
