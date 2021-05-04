package com.example.demo.Service;

import com.example.demo.Repo.ItemRepo;
import com.example.demo.model.Category;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepo itemRepo;
    @Override
    public Item create(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public Item update(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public void delete(Long id) {
        itemRepo.deleteById(id);
    }

    @Override
    public List<Item> getAll() {
        return itemRepo.findAll();
    }
    @Override
    public List<Item> getByCategory(Category category) {
        return itemRepo.findAll().stream().filter(x->x.getCategory().equals(category)).collect(Collectors.toList());
    }
}
