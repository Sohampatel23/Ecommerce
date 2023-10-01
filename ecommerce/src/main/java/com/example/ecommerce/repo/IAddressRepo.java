package com.example.ecommerce.repo;

import com.example.ecommerce.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAddressRepo extends CrudRepository<Address,Long> {
    List<Address> findByUserId(Long userId);
}
