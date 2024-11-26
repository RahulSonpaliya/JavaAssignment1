package com.example.assignment1;

import com.example.assignment1.repository.CustomerRepositoryImpl;
import com.example.assignment1.service.CustomerService;
import com.example.assignment1.service.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
		CustomerService customerService = new CustomerServiceImpl(new CustomerRepositoryImpl());
		System.out.println("All customers having Visa cards :\n");
		customerService.getAllVisaCardCustomers().forEach(System.out::println);
		System.out.println("\nAll customers having balance more than 9 thousand :\n");
		customerService.getAllCustomersHavingBalanceMoreThan9Thousand().forEach(System.out::println);
	}

}
