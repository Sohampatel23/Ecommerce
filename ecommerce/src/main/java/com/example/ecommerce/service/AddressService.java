package com.example.ecommerce.service;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repo.IAddressRepo;
import com.example.ecommerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private IAddressRepo addressRepo;

    public List<Address> getAddressesByUserId(Long userId) {
        return addressRepo.findByUserId(userId);
    }

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }
}
