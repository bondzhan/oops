package org.you.oops.order.domain.userorder.entity.valueobject;

import java.util.Arrays;
import java.util.Objects;

public enum OrderType {
    BONDED(1,"保税"),

    NONBONDED(2,"非保税");

    private int val;

    private String name;

    OrderType() {
    }

    OrderType(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 普通方法
    public static OrderType getOrderType(int val) {
        for (OrderType c : OrderType.values()) {
            if (c.val == val) {
                return c;
            }
        }
        return null;
    }

}
