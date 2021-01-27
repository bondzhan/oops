package org.you.oops.order.interfaces.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.you.oops.order.domain.userorder.entity.UserOrder;
import org.you.oops.order.domain.userorder.entity.valueobject.OrderType;
import org.you.oops.order.domain.userorder.service.UserOrderService;
import org.you.oops.order.interfaces.dto.UserOrderDto;

@RestController
@RequestMapping("/userOrder")
public class UserOrderApiImpl implements  UserOderApi{
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderService userOrderService;

    @Override
    public UserOrderDto findUserOrderById(UserOrderDto userOrderDto) {
        log.info("accept UserOrderDto {}",userOrderDto.toString());
        UserOrder userOrder= new UserOrder();
        userOrder.setOrderType(OrderType.getOrderType(userOrderDto.getOrderType()));
        userOrder = userOrderService.createOrder(userOrder);
        userOrderDto.setOrderId(userOrder.getOrderId());
        return userOrderDto;
    }
}
