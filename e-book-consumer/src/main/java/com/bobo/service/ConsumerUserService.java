package com.bobo.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * 调用用户服务
 * @author dengp
 *
 */
@FeignClient("e-book-user")
public interface ConsumerUserService extends UserService {

}
