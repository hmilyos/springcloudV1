package com.hmily.trans.service;


import com.hmily.trans.dto.OrderDTO;

public interface IOrderService {

    OrderDTO create(OrderDTO dto);

    OrderDTO getMyOrder(Long id);
}
