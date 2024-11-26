package com.example.assignment1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private long id;
    private String name;
    private String email;
    private String dob;
    private String mobileNumber;
    private String cardNumber;
    private double balance;
    private String address;
}
