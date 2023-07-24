package com.example.dbfileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbFileUploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbFileUploadApplication.class, args);
        System.out.print("Server is running on port 8081!");
    }

}
