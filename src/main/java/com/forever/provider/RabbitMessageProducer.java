package com.forever.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Rabbit消息发送端
 */
@Component
public class RabbitMessageProducer {

  private static final Integer HIGH_PRIORITY = 10;

  private static final Integer LOW_PRIORITY = 5;

  @Value("topicExchange")
  private String defaultExchange;

  @Autowired
  private AmqpTemplate amqpTemplate;

  /**
   * 发送消息
   * @param message
   * @param routingKey
   */
  public void sendMessage(String message, String routingKey) {
    amqpTemplate.convertAndSend(defaultExchange, routingKey, message);
  }

  /**
   * 发送消息
   * @param message
   * @param routingKey
   * @return
   */
  public Object sendMessageAndReceive(String message, String routingKey) {
    return amqpTemplate.convertSendAndReceive(defaultExchange, routingKey, message);
  }
}
