package cn.com.lenovo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {
	
	@JmsListener(destination="mytest.queue")
	public void receiveQueue(String message){
		System.out.println("接收到的报文为："+message);
	}
	
}
