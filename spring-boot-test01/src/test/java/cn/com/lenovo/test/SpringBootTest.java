package cn.com.lenovo.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.com.lenovo.controller.StudentController;

@RunWith(SpringRunner.class)
@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {
	@Autowired
	private MockMvc mvc;

	@Before
	public void before(){
		mvc=MockMvcBuilders.standaloneSetup(new StudentController()).build();
	}
	
	public void contextLoads(){
	}
}
