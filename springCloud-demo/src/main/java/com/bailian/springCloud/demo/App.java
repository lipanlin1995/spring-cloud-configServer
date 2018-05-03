package com.bailian.springCloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
@RestController
public class App {
    public static void main( String[] args ){
        //dd
        SpringApplication.run(App.class, args);
    }
    
}
