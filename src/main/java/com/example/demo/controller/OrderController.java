package com.example.demo.controller;

import com.example.demo.Service.OrderService;
import com.example.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Order")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getAll")
    public Set<Order> getAll(){
        return orderService.getOrders();
    }
    @GetMapping("/create")
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }
    @GetMapping("/getById/{id}")
    public Order getById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }
    @PutMapping("/update")
    public Order update(@RequestBody Order order){
        return orderService.update(order);
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        orderService.delete(id);
        return "Successfully deleted";
    }

}
