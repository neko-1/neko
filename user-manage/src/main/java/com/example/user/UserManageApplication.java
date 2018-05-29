package com.example.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author lzh
 */

@SpringBootApplication
public class UserManageApplication {

    public static void main(String[] args) {
        SpringApplication s=new SpringApplication();
        SpringApplication.run(UserManageApplication.class, args);
    }
}
