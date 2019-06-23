package com.bobo.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("e-book-order")
public interface ProviderOrderService extends OrderService{

}
