package com.learn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.learn.*"})
public class SpringLearnApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApp.class, args);
    }
}
