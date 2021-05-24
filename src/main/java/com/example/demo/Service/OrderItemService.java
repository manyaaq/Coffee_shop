package com.example.demo.Service;

import com.example.demo.model.OrderItem;

public interface OrderItemService {
    OrderItem create(OrderItem orderItem);
    OrderItem update(OrderItem orderItem);

}
