package com.bobo.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 调用支付服务
 * @author dengp
 *
 */
@FeignClient("e-book-trade")
public interface ConsumerTradeService extends TradeService {

}
