package com.fred4jupiter.feignexample.client;

import com.fred4jupiter.feignexample.api.CustomerServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "customerClient", url = "http://localhost:8080")
public interface CustomerClient extends CustomerServiceApi {

}
