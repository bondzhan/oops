package org.you.oops.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.you.oops.order.interfaces.dto.UserOrderDto;
import org.you.oops.order.interfaces.facade.UserOderApi;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserOderApi userOderApi;

    @RequestMapping("/getTest")
    public String getTest(@RequestParam int orderType){
        UserOrderDto userOrderDto = new UserOrderDto();
        userOrderDto.setOrderType(orderType);
        userOrderDto = userOderApi.findUserOrderById(userOrderDto);
        return userOrderDto.toString();
    }
}
