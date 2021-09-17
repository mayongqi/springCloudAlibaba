package com.study.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: 订单
 * @author: ma
 * @create: 2021-09-13 21:55
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @PostMapping
    public String placeProduct(){
        return "商品出货成功";
    }


    @GetMapping
    public String findProduct(){
        return "查询商品成功";
    }

}
