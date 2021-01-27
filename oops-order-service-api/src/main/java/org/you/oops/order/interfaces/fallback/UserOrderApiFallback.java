package org.you.oops.order.interfaces.fallback;

import org.springframework.stereotype.Component;
import org.you.oops.order.interfaces.dto.UserOrderDto;
import org.you.oops.order.interfaces.facade.UserOderApi;

@Component
public class UserOrderApiFallback implements UserOderApi {

    @Override
    public UserOrderDto findUserOrderById(UserOrderDto userOrderDto) {
        return new UserOrderDto();
    }
}
