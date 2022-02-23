package com.wkk.server;

import com.wkk.server.configuration.GrpcServerManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.wkk.*"})
public class ServerWebApplication {

    public static void main(String[] args) {
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "{}");
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(ServerWebApplication.class, args);
        GrpcServerManager grpcServerManager = (GrpcServerManager) applicationContext.getBean("grpcServerManager");
        grpcServerManager.start();
    }

}
