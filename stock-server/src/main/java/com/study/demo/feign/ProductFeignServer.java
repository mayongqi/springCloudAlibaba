package com.study.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * name: 调用服务配置的spring.application.name,也就是服务的名称
 * path： 对应controller的路径
 */
@FeignClient(name = "product-server",path = "/product")
public interface ProductFeignServer {

    @PostMapping
    public String placeProduct();


    @GetMapping
    public String findProduct();
}
