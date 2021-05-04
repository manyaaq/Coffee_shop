package com.example.demo.Service;


import com.example.demo.Repo.OrderRepo;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepo orderRepo;

    @Override
    public Set<Order> getOrders() {
        return new HashSet<>(orderRepo.findAll()) ;

    }

    @Override
    public Order getOrderById(Long id) {

        return orderRepo.findById(id).get();

    }

    @Override
    public Order create(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public Order update(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepo.deleteById(id);

    }
}
