package com.example.springbootbasic.controller;

import com.example.springbootbasic.beans.Address;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController("address/")
public class AddressController {

    @GetMapping("{id}")
    @ResponseBody
    public Address getAddressById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public Boolean deleteAddressById(@PathVariable Long id){
        return false;
    }

    @PutMapping
    public Address editAddress(Address address){
        return null;
    }

    @PostMapping("new")
    public Address createAddress(Address address){
        return null;
    }
}
