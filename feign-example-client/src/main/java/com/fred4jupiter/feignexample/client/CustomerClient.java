package com.fred4jupiter.feignexample.client;

import com.fred4jupiter.feignexample.api.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "customerClient", url = "http://localhost:8080")
public interface CustomerClient {

    @RequestMapping(method = RequestMethod.GET, path = "/customers")
    List<Customer> findAllCustomers();

    @RequestMapping(method = RequestMethod.GET, path = "/customers/{name}")
    List<Customer> findCustomersByName(@PathVariable("name") String name);
}
