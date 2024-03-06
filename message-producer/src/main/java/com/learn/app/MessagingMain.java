package com.learn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.learn.*"})
public class MessagingMain {
    public static void main(String[] args) {
        SpringApplication.run(MessagingMain.class, args);
    }
}
