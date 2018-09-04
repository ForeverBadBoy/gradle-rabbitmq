package com.forever.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author LENOVO
 * @date 2018/9/4
 */
@Configuration
@EnableRabbit
public class RabbitConfig {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private ConnectionFactory connectionFactory;
}
