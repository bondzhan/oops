package org.you.oops.order.domain.userorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.you.oops.order.domain.userorder.entity.UserOrder;
import org.you.oops.order.domain.userorder.repository.mapper.BbcOrderMapper;
import org.you.oops.order.domain.userorder.repository.po.BbcOrderPO;

@Service
public class UserOrderService {

    @Autowired
    private BbcOrderMapper orderMapper;

    @Transactional
    public UserOrder createOrder(UserOrder userOrder){
        userOrder.createOrder();
        BbcOrderPO bbcOrderPO = new BbcOrderPO();
        bbcOrderPO.setForderId(userOrder.getOrderId());
        bbcOrderPO.setForderType(userOrder.getOrderType().getVal());
        orderMapper.insertSelective(bbcOrderPO);
        userOrder.setOrderId(bbcOrderPO.getForderId());
        return userOrder;
    }
}
