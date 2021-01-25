package org.you.oops.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan("org.you.oops")
public class OrderApplication {

    public static void main(String args[]){
        SpringApplication.run(OrderApplication.class);
    }
}
