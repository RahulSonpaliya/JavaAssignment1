package com.example.assignment1.repository;

import com.example.assignment1.entity.Customer;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public List<Customer> getAllCustomer() {
        try {
            var customers = new ArrayList<Customer>();
            readCustomerDataTextFile().forEach(line -> {
                var st = new StringTokenizer(line, "~");
                var id = Long.parseLong(st.nextToken());
                var name = st.nextToken();
                var email = st.nextToken();
                var dob = st.nextToken();
                var mobileNumber = st.nextToken();
                var cardNumber = st.nextToken();
                var balance = Double.parseDouble(st.nextToken());
                var address = st.nextToken();
                var c = new Customer(id, name, email, dob, mobileNumber, cardNumber, balance, address);
                customers.add(c);
            });
            return customers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> readCustomerDataTextFile() throws IOException {
        // Locate the file inside the resources folder
        File file = ResourceUtils.getFile("classpath:customers_data.txt");
        // Read lines from the file
        return Files.readAllLines(file.toPath());
    }

}
