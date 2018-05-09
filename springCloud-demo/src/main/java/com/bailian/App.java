package com.bailian;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication(scanBasePackages="com.bailian")
@EnableEurekaServer
@EnableConfigServer
public class App{
    
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }

    
}

