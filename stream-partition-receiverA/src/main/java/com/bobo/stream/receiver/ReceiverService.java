package com.bobo.stream.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import com.bobo.stream.pojo.Product;

/**
 * 具体接收消息的处理类
 * @author dengp
 *
 */
@Service
@EnableBinding(IReceiverService.class)
public class ReceiverService {

	@StreamListener(IReceiverService.INPUT)
	public void onReceiver(Product p){
		System.out.println("消费者A:"+p);
	}
}
