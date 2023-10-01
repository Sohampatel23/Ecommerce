package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/by-category")
    public List<Product> getProductsByCategory(@RequestParam("category") String category) {
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping("/api/products/{id}")
    public String deleteProductById(@PathVariable Long id) {
        return productService.deleteProductById(id);

    }
}
