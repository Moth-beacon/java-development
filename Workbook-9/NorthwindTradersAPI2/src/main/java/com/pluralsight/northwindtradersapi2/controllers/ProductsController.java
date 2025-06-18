package com.pluralsight.northwindtradersapi2.controllers;

import com.pluralsight.northwindtradersapi2.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    private List<Product> productList = new ArrayList<>();

    public ProductsController() {
        productList.add(new Product(1, "Laptop", 1, 799.99));
        productList.add(new Product(2, "Mouse", 1, 25.00));
        productList.add(new Product(3, "Notebook", 2, 3.49));
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productList;
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int id) {
        return productList.stream()
                .filter(product -> product.getProductId() == id)
                .findFirst()
                .orElse(null);
    }
}
