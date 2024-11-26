package com.example.assignment1.service;

import com.example.assignment1.entity.Customer;
import com.example.assignment1.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllVisaCardCustomers() {
        var allCustomers = customerRepository.getAllCustomer();
        return allCustomers.stream().filter(customer -> customer.getCardNumber().startsWith("3")).toList();
    }

    @Override
    public List<Customer> getAllCustomersHavingBalanceMoreThan9Thousand() {
        var allCustomers = customerRepository.getAllCustomer();
        return allCustomers.stream().filter(customer -> customer.getBalance() > 9000).toList();
    }
}
