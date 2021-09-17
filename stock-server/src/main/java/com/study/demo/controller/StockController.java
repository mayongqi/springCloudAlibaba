package com.study.demo.controller;

import com.study.demo.feign.ProductFeignServer;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 库存
 * @author: ma
 * @create: 2021-09-13 21:55
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private ProductFeignServer productFeignServer;

    @PostMapping
    public String placeOrder(){
        return "扣减库存成功";
    }


    @GetMapping
    public String findOrder(){
        String product = productFeignServer.findProduct();
        if(StringUtils.isNotEmpty(product)){
            return "查询库存成功 " + product;
        }
        return "查询库存成功";
    }

}
