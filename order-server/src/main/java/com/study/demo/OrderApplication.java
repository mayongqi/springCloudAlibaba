package com.study.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: demo
 * @description: 订单服务启动类
 * @author: ma
 * @create: 2021-09-13 21:50
 */
@SpringBootApplication
public class OrderApplication {


    public static void main(String[] args) {
      SpringApplication.run(OrderApplication.class, args);
    }
}
