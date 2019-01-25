package com.fred4jupiter.feignexample.client;

import com.fred4jupiter.feignexample.api.CustomerServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("customerClient")
public interface CustomerClient extends CustomerServiceApi {

}
