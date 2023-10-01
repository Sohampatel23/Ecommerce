package com.example.ecommerce.service;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.model.Order;
import com.example.ecommerce.repo.IAddressRepo;
import com.example.ecommerce.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private IOrderRepo orderRepo;

    public Order getOrderByIdAndUserId(Long id, Long userId) {
        return orderRepo.findByIdAndUserId(id, userId).orElse(null);
    }

    public Order placeOrder(Order orderRequest) {
        return orderRepo.save(orderRequest);
    }

    public Order getOrderById(Long id) {
        return orderRepo.findById(id).get();
    }
}
