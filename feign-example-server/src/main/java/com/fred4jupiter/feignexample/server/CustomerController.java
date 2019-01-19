package com.fred4jupiter.feignexample.server;

import com.fred4jupiter.feignexample.api.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    private List<Customer> customers = new ArrayList<>();

    public CustomerController() {
        this.customers.add(new Customer("A"));
        this.customers.add(new Customer("B"));
        this.customers.add(new Customer("C"));
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers() {
        return this.customers;
    }

    @GetMapping("/customers/{name}")
    public List<Customer> findByName(@PathVariable("name") String name) {
        LOG.info("findByName: name={}", name);
        return this.customers.stream().filter(customer -> customer.getName().equals(name)).collect(Collectors.toList());
    }
}
