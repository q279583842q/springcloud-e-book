package com.bobo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import com.bobo.stream.StreamSenderStart;
import com.bobo.stream.pojo.Product;
import com.bobo.stream.sender.ISendeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StreamSenderStart.class)
public class StreamTest {
	
	@Autowired
	private ISendeService sendService;

	@Test
	public void testStream(){
		Product p = new Product(999, "stream test ...999");
		// 将需要发送的消息封装为Message对象
		Message message = MessageBuilder
								.withPayload(p)
								.build();
		sendService.send().send(message );
	}
}
