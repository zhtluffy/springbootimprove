package com.itszt.springbootimprove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itszt.springbootimprove.dao")
public class SpringbootimproveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootimproveApplication.class, args);
    }

}
