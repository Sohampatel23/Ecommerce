package com.example.ecommerce.service;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }
}
