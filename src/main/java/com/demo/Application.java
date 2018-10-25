package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/10/25
 */
@SpringBootApplication
@MapperScan(basePackages = {"tk.mybatis.mapper,com.demo.*.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
