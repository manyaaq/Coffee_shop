package com.example.demo.Service;

import com.example.demo.Repo.CategoryRepo;
import com.example.demo.model.Category;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepo repo;
    @Override
    public Category create(Category category) {
        return repo.save(category);
    }

    @Override
    public Category update(Category category) {
        return repo.save(category);
    }

    @Override
    public void delete(Long id) {
    repo.deleteById(id);
    }


}
