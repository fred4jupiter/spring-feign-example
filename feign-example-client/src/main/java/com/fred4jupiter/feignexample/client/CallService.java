package com.fred4jupiter.feignexample.client;

import com.fred4jupiter.feignexample.api.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CallService {

    private static final Logger LOG = LoggerFactory.getLogger(CallService.class);

    @Autowired
    private CustomerClient customerClient;

    @PostConstruct
    public void printCustomers() {
        List<Customer> allCustomers = customerClient.findAllCustomers();
        LOG.info("allCustomers={}", allCustomers);

        List<Customer> customers = customerClient.findCustomersByName("A");
        LOG.info("customers={}", customers);
    }
}
