package com.async.databasemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("reactor.rabbitmq")
public class DatabaseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseManagerApplication.class, args);
    }

}
