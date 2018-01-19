package cn.com.lenovo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public Map hello(){
		Map map = new HashMap();
		map.put("name", "jack");
		map.put("age", 18);
		map.put("address", "北京");
		return map;
	}
}
