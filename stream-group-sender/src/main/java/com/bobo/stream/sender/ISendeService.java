package com.bobo.stream.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * 发送消息的接口
 * @author dengp
 *
 */
public interface ISendeService {
	
	String OUTPUT="outputProduct";
	

	/**
	 * 指定输出的交换器名称
	 * @return
	 */
	@Output(OUTPUT)
	SubscribableChannel send();
}
