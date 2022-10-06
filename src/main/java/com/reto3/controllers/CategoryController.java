package com.reto3.controllers;

import com.reto3.entities.Category;
import com.reto3.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getCategories(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    public Category postCategory(@RequestBody Category category){
        return categoryService.save(category);
    }
}

