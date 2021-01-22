package org.you.oops.order.interfaces.dto;

public class UserOrderDto {

    private String userName;

    private String userId;

    private String orderId;

    public UserOrderDto() {
    }

    @Override
    public String toString() {
        return "UserOrderDto{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }

    public UserOrderDto(String userName, String userId, String orderId) {
        this.userName = userName;
        this.userId = userId;
        this.orderId = orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserId() {
        return userId;
    }
}
