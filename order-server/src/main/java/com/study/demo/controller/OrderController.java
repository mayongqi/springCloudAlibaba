package com.study.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: demo
 * @description: 订单
 * @author: ma
 * @create: 2021-09-13 21:55
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @PostMapping
    public String placeOrder(){
        return "下单成功";
    }


    @GetMapping
    public String findOrder(){
        String message = restTemplate.getForObject("http://stock-server/stock", String.class);
        if(!StringUtils.isEmpty(message)){
            return "查询订单成功" + port + "  调用库存成功  " + message;
        }
        return "查询订单成功" + port;
    }

}
