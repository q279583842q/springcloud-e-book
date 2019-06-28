package com.bobo.stream.receiver;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 接收消息的接口
 * @author dengp
 *
 */
public interface IReceiverService {

	/**
	 * 指定接收的交换器名称
	 * @return
	 */
	@Input("dpb-exchange")
	SubscribableChannel receiver();
}
