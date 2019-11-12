package com.wangjh.echartsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.wangjh.echartsdemo.mapper"})
public class EchartsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchartsDemoApplication.class, args);
    }

}
