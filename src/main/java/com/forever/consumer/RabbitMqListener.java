package com.forever.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhq
 * @date 2022/5/17
 */
@Slf4j
@Configuration
public class RabbitMqListener {

    /**
     * 定义队列的监听方法，RabbitListener表示监听哪一个队列
     *
     * @param message
     */
    @RabbitListener(queues = "boot_queue")
    public void ListenerQueue(Message message) {
        log.info("message= {}", message);
    }

}
