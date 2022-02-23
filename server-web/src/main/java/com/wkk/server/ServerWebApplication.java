package com.wkk.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.wkk.*"})
public class ServerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerWebApplication.class, args);
    }

}
