package org.you.oops.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients("org.you.oops.*")
public class OrderApplication {

    public static void main(String args[]){
        SpringApplication.run(OrderApplication.class);
    }
}
