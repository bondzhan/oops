package org.you.oops.order.domain.userorder.entity;

import org.you.oops.order.domain.userorder.entity.valueobject.OrderType;

import java.util.Random;

public class UserOrder {

    String orderId;

    OrderType orderType;

    public void createOrder(){
        Random random = new Random();//指定种子数字
        this.setOrderId(random.nextInt() + "");
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }


    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

}
