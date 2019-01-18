package com.myhttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;

@SpringBootApplication
public class MyHttpApplication {
    public static void main(String[] args){
        SpringApplication.run(MyHttpApplication.class,args);
    }
}
