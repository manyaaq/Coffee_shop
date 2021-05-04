package com.example.demo.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Item;

import java.util.List;

public interface ItemService {
    Item create (Item item);
    Item update (Item item);
    void delete (Long id);
    List<Item> getAll();
    List<Item> getByCategory(Category name);
}
