package org.you.oops.order.interfaces.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.you.oops.order.interfaces.dto.UserOrderDto;

@RestController
@RequestMapping("/userOrder")
public class UserOrderApiImpl implements  UserOderApi{

    @Override
    public UserOrderDto findUserOrderById(String userId) {
        return new UserOrderDto("bond", "007", "01010101");
    }
}
