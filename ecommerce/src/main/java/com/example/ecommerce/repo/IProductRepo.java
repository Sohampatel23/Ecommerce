package com.example.ecommerce.repo;

import com.example.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductRepo extends CrudRepository<Product,Long> {
    List<Product> findByCategory(String category);
}
