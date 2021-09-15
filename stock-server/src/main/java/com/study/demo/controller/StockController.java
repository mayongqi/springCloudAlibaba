package com.study.demo.controller;

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

    @PostMapping
    public String placeOrder(){
        return "扣减库存成功";
    }


    @GetMapping
    public String findOrder(){
        return "查询库存成功";
    }

}
