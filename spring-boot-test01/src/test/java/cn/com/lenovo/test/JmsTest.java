package cn.com.lenovo.test;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.lenovo.jms.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsTest {
	
	@Autowired
	private Producer producer;
	
	@Test
	public void testJms(){
		Destination destination = new ActiveMQQueue("mytest.queue");
		producer.sendMessage(destination, "测试activemq");
	}
}
