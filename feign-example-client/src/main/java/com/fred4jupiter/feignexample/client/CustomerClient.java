package com.fred4jupiter.feignexample.client;

import com.fred4jupiter.feignexample.api.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@FeignClient(name = "customerClient", url = "${my.server.api.url}")
public interface CustomerClient {

    @GetMapping("/customers")
    List<Customer> findAllCustomers();

    @GetMapping("/customers/{name}")
    List<Customer> findCustomersByName(@PathVariable("name") String name);

    @GetMapping("/customers/map")
    Map<Integer, String> findCustomerMap();
}
