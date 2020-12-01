package com.example.springbootbasic.controller;

import com.example.springbootbasic.beans.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account/")
public class AccountController {

    @GetMapping("{id}")
    @ResponseBody
    public Account getAccountById(@PathVariable Long id){
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public Boolean deleteAccountById(@PathVariable Long id){
        return false;
    }

    @PutMapping
    public Account editAccount(Account account){
        return null;
    }

    @PostMapping("new")
    public Account createAccount(Account account){
        return null;
    }
}
