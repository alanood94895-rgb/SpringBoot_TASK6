package com.example.EmailUpdate;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {

    private HashMap<Integer, Product> products = new HashMap<>();

    public ProductController() {
        products.put(1, new Product(1, "Laptop", 10));
    }

    @PutMapping("/update-stock/{id}")
    public String updateStock(
            @PathVariable int id,
            @RequestParam int quantity) {

        // Check if product exists
        if (!products.containsKey(id)) {
            return "Product not found";
        }

        // Retrieve product
        Product product = products.get(id);

        // Store previous stock
        int previousStock = product.getStockQuantity();

        // Update stock quantity
        product.setStockQuantity(quantity);

        // Return confirmation
        return "Product Updated Successfully\n"
                + "Product Name: " + product.getName() + "\n"
                + "Previous Stock: " + previousStock + "\n"
                + "Updated Stock: " + product.getStockQuantity();
    }
}

