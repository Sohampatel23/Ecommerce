package com.example.ecommerce.repo;

import com.example.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IOrderRepo extends CrudRepository<Order,Long> {
    Optional<Order> findByIdAndUserId(Long id, Long userId);
}
