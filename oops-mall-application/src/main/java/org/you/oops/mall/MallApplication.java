package org.you.oops.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan("org.you.oops")
//开启Feign扫描
@EnableFeignClients("org.you.oops.*.interfaces.facade")
public class MallApplication {

    public static void main(String args[]){
        SpringApplication.run(MallApplication.class);
    }
}
