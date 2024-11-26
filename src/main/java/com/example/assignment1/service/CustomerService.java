package com.example.assignment1.service;

import com.example.assignment1.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllVisaCardCustomers();
    List<Customer> getAllCustomersHavingBalanceMoreThan9Thousand();
}
