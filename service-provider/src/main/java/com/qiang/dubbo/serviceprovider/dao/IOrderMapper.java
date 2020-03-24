package com.qiang.dubbo.serviceprovider.dao;

import com.qiang.dubbo.models.OrderModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderMapper {
    List<OrderModel> getOrders();
}
