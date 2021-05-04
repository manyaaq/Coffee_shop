package com.example.demo.controller;

import com.example.demo.Service.ItemService;
import com.example.demo.model.Category;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/create")
    public Item create (@RequestBody Item item){
        return itemService.create(item);
    }


    @GetMapping("getAll")
    public List<Item> getAll(){
        return itemService.getAll();
    }

    @PutMapping("/update")//
    public Item update (@RequestBody Item item ){
        return itemService.update(item);
    }

    @PostMapping("/delete/{id}")
    public void deleteByItem(@PathVariable Long id){
        itemService.delete(id);
    }





}
