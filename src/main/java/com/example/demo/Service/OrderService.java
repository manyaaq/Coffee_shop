package com.example.demo.Service;

import com.example.demo.model.Order;

import java.util.Set;

public interface OrderService {
    Set<Order> getOrders();

    Order getOrderById(Long id);
    Order create(Order order);
    Order update(Order order);
    void delete(Long id);
}
