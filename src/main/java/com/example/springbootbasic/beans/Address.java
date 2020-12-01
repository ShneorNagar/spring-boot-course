package com.example.springbootbasic.beans;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;

@Component
@Scope("prototype")
@Getter
@Setter
public class Address {

    @NonNull
    @Value("${address.default.address1}")
    private String address1;

    @Value("${address.default.address2}")
    private String address2;

    @NonNull
    @Value("${address.default.country}")
    private String country;

    @NonNull
    @Value("${address.default.city}")
    private String City;

    @Value("${address.default.zipCode}")
    private String zipCode;

    @PostConstruct
    public void init() {
        System.out.println(getClass().getSimpleName() + " in @PostConstruct");
    }
}
