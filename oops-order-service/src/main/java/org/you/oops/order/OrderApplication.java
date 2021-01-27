package org.you.oops.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan("org.you.oops")
@MapperScan("org.you.oops.*.domain.**.mapper")
public class OrderApplication {

    public static void main(String args[]){
        SpringApplication.run(OrderApplication.class);
    }
}
