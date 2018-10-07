package com.hmily.trans.order.controller;


import com.hmily.trans.order.domain.Order;
import com.hmily.trans.common.dto.OrderDTO;
import com.hmily.trans.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;


@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostConstruct
    public void init() {
        Order order = new Order();
        order.setAmount(100);
        order.setTitle("MyOrder");
        order.setDetail("Bought a hmily course");
        orderService.save(order);
    }

    @Autowired
    private IOrderService orderService;

    @PostMapping("")
    public OrderDTO create(@RequestBody OrderDTO dto) {
        return orderService.create(dto);
    }

    @GetMapping("/{id}")
    public OrderDTO getMyOrder(@PathVariable Long id) {
        return orderService.getMyOrder(id);
    }

    @GetMapping("")
    public List<Order> getAll() {

        return orderService.findAll();
    }

}
