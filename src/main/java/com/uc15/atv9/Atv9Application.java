package com.uc15.atv9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class Atv9Application {

    public static void main(String[] args) {
        SpringApplication.run(Atv9Application.class, args);
    }
}
