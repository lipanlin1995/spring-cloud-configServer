package com.bailian.springCloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication
public class App {
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
