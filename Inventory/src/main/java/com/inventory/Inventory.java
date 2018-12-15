package com.inventory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by SAKSHI TRIPATHI on 11/18/2018.
 */
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration
@MapperScan(basePackages = "com")
@SpringBootApplication
public class Inventory {
    public static void main(String args[]) {
        SpringApplication.run(Inventory.class, args);
    }
}
