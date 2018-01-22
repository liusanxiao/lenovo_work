package cn.com.lenovo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {
	
	@JmsListener(destination="mytest.queue")
	@SendTo("out.queue")
	public String receiveQueue(String message){
		System.out.println("consumer2收到的报文为："+message);
		return "return message: consumer2收到的报文为"+message;
	}
}
