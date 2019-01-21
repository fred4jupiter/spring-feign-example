package com.fred4jupiter.feignexample.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface CustomerServiceApi {

    @RequestMapping(method = RequestMethod.GET, path = "/customers")
    List<Customer> findAllCustomers();

    @RequestMapping(method = RequestMethod.GET, path = "/customers/{name}")
    List<Customer> findCustomersByName(@PathVariable("name") String name);
}
