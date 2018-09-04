package com.forever.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author LENOVO
 * @date 2018/9/5
 */
@Slf4j
@Component
public class SendMailConsumer {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "forever.sms.queue", durable = "true"),
            exchange = @Exchange(value = "topicExchange", type = ExchangeTypes.TOPIC,
                    durable = "true", ignoreDeclarationExceptions = "true"),
            key = "forever.sms.key"))
    public void handleMessage(String msg) {
        log.info("======执行消费逻辑，msg:{}======", msg);
    }
}
