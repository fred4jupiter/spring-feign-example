package com.fred4jupiter.feignexample.client;

import com.fred4jupiter.feignexample.api.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerClientMT {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerClientMT.class);

    @Autowired
    private CustomerClient customerClient;

    @Test
    public void findAllCustomers() {
        List<Customer> allCustomers = customerClient.findAllCustomers();
        LOG.info("allCustomers={}", allCustomers);
    }

    @Test
    public void findCustomersByName() {
        List<Customer> customers = customerClient.findCustomersByName("A");
        LOG.info("customers={}", customers);
    }
}
