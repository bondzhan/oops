package org.you.oops.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients("org.you.oops.*")
public class MallApplication {

    public static void main(String args[]){
        SpringApplication.run(MallApplication.class);
    }
}
