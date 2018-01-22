package cn.com.lenovo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Value("${lenovo.random}")
	private String random;
	@RequestMapping(value="/hello")
	@ResponseBody
	public Map hello(){
		Map map = new HashMap();
		map.put("name", "jack");
		map.put("age", 18);
		map.put("address", "北京");
		return map;
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public Map get(){
		Map map = new HashMap();
		map.put("random", random);
		return map;
	}
}
