package com.example.ecommerce.controller;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;


    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }
    @GetMapping("/by-user")
    public List<Address> getAddressesByUserId(@RequestParam("userId") Long userId) {
        return addressService.getAddressesByUserId(userId);
    }
}
