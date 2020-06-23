package com.cmpay.gx;

import com.cmpay.lemon.common.LemonFramework;
import com.cmpay.lemon.framework.LemonBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

/**
 * @author GX
 */

@LemonBootApplication(exclude = {RabbitAutoConfiguration.class}, value = {"com.cmpay"})
public class MangerApplication {
    public static void main(String[] args) {
        LemonFramework.run(MangerApplication.class, args);
    }
}