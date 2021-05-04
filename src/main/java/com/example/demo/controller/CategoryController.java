package com.example.demo.controller;

import com.example.demo.Service.CategoryService;
import com.example.demo.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public Category create (Category category){
        return categoryService.create(category);
    }
    @PostMapping("/update")
    public Category update (Category category){
        return categoryService.update(category);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id ){
        categoryService.delete(id);
    }
}
