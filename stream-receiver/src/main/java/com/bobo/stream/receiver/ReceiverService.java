package com.bobo.stream.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * 具体接收消息的处理类
 * @author dengp
 *
 */
@Service
@EnableBinding(IReceiverService.class)
public class ReceiverService {

	@StreamListener("dpb-exchange")
	public void onReceiver(byte[] msg){
		System.out.println("消费者:"+new String(msg));
	}
}
