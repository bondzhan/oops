package org.you.oops.order.interfaces.dto;

public class UserOrderDto {

    @Override
    public String toString() {
        return "UserOrderDto{" +
                "orderType=" + orderType +
                ", orderId='" + orderId + '\'' +
                '}';
    }

    public UserOrderDto() {
    }

    private int orderType;
    private String orderId;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getOrderType() {
        return orderType;
    }
}
