package org.you.oops.order.interfaces.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.you.oops.order.interfaces.dto.UserOrderDto;

@RestController
@RequestMapping("/userOrder")
public class UserOrderApiImpl implements  UserOderApi{
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public UserOrderDto findUserOrderById(String userId) {
        log.info("accept userid {}",userId);
        return new UserOrderDto("bond", "007", "01010101");
    }
}
