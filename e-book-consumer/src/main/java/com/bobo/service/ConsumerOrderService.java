package com.bobo.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 调用订单服务
 * @author dengp
 *
 */
@FeignClient("e-book-order")
public interface ConsumerOrderService extends OrderService {

}
