package com.hmily.trans.order.service;

import com.hmily.trans.order.domain.Order;

import java.util.List;

public interface IOrderService extends com.hmily.trans.common.service.IOrderService {
    Order  save(Order order);

    List<Order> findAll();
}
