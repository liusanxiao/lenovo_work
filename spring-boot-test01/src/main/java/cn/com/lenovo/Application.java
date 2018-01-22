package cn.com.lenovo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJms //开启对jms的支持
@SpringBootApplication
@MapperScan("cn.com.lenovo.mapper") //整合mybatis
@EnableTransactionManagement //开启事务
@ComponentScan
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
