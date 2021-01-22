package org.you.oops.order.interfaces.facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.you.oops.order.interfaces.dto.UserOrderDto;
import org.you.oops.order.interfaces.fallback.UserOrderApiFallback;

@FeignClient(value = "oops-order-service", path = "userOrder", fallback = UserOrderApiFallback.class)
public interface UserOderApi {

    @RequestMapping("findUserOrderById")
    public UserOrderDto findUserOrderById(String userId);

}
