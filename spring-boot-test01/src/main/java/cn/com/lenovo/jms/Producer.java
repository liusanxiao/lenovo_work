package cn.com.lenovo.jms;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void sendMessage(Destination destination ,String message){
		jmsTemplate.convertAndSend(destination, message);
	}
	
	
	@JmsListener(destination="out.queue")
	public void consumerMessage(String message){
		System.out.println("producer收到的回复为："+message);
	}
}
