package com.pluralsight.northwindtradersapi2.controllers;

import com.pluralsight.northwindtradersapi2.models.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
    private List<Category> categoryList = new ArrayList<>();

    public CategoriesController() {
        categoryList.add(new Category(1, "Electronics"));
        categoryList.add(new Category(2, "Office Supplies"));
    }

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return categoryList;
    }

    @RequestMapping(path = "/categories/{id}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable int id) {
        return categoryList.stream()
                .filter(category -> category.getCategoryId() == id)
                .findFirst()
                .orElse(null);
    }
}
