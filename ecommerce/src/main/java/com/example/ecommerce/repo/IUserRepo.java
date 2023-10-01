package com.example.ecommerce.repo;

import com.example.ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Long> {
}
