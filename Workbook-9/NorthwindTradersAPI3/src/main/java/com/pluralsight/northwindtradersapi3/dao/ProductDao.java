package com.pluralsight.northwindtradersapi3.dao;

import com.pluralsight.northwindtradersapi3.models.Product;
import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);
}