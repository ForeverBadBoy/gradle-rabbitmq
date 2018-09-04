package com.forever;

import com.forever.config.RabbitConfig;
import com.forever.provider.RabbitMessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GradleDemoApplicationTests {

	@Autowired
	private RabbitConfig rabbitConfig;

	@Autowired
	private RabbitMessageProducer rabbitMessageProducer;

	@Test
	public void contextLoads() {
		log.info("start success");
		log.info("rabbitConfig:{}", rabbitConfig);
		String message = "hello";
		String routingKey = "forever.sms.key";
		rabbitMessageProducer.sendMessage(message, routingKey);
	}

}
