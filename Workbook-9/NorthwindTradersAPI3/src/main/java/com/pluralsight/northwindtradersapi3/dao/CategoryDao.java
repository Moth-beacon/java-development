package com.pluralsight.northwindtradersapi3.dao;

import com.pluralsight.northwindtradersapi3.models.Category;
import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
}