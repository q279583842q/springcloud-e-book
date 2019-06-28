package com.bobo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import com.bobo.stream.StreamSenderStart;
import com.bobo.stream.sender.ISendeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StreamSenderStart.class)
public class StreamTest {
	
	@Autowired
	private ISendeService sendService;

	@Test
	public void testStream(){
		String msg = "hello stream ...";
		// 将需要发送的消息封装为Message对象
		Message message = MessageBuilder
								.withPayload(msg.getBytes())
								.build();
		sendService.send().send(message );
	}
}
