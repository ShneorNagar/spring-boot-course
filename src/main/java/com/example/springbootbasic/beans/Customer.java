package com.example.springbootbasic.beans;

import lombok.ToString;
import org.springframework.stereotype.Component;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@ToString
@Entity
public class Customer {

    @Id
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;
}
