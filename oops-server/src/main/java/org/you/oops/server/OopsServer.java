package org.you.oops.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OopsServer {
    public static void main(String args[]){
        SpringApplication.run(OopsServer.class, args);
    }
}
