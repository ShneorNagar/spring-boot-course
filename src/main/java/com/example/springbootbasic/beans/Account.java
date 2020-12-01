package com.example.springbootbasic.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Getter
@Setter
@Entity
public class Account {

    @Id
    private long number;

    @Column
    private float balance;

    @Column
    private float overDraftCapt;

    @Column
    private float overDraftInterest;
}
