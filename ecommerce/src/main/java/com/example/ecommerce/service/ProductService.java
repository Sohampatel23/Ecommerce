package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepo productRepo;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepo.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public String deleteProductById(Long id) {
        productRepo.deleteById(id);
        return "Product Deleted";
    }
}
