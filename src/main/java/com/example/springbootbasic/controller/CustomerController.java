package com.example.springbootbasic.controller;

import com.example.springbootbasic.beans.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public Customer getCustomerById(Long id){
        return null;
    }

    @DeleteMapping
    public Boolean deleteCustomerById(Long id){
        return false;
    }

    @PutMapping
    public Customer editCustomer(Customer customer){
        return null;
    }

    @PostMapping
    public Customer createCustomer(Customer customer){
        return null;
    }
}
