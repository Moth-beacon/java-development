package com.pluralsight.northwindtradersapi3.controllers;

import com.pluralsight.northwindtradersapi3.dao.CategoryDao;
import com.pluralsight.northwindtradersapi3.models.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private final CategoryDao categoryDao;

    public CategoriesController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryDao.getAll();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryDao.getById(id);
    }
}
