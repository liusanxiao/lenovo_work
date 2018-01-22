package cn.com.lenovo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.lenovo.pojo.Student;
import cn.com.lenovo.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService stuService;
	
	@RequestMapping("/stu/list")
	@ResponseBody
	public List<Student> getStuList(){
		return stuService.getStuList();
	}
	
	@RequestMapping("/page/stu/list")
	public String showStuList(Model model){
		List<Student> stuList = stuService.getStuList();
		model.addAttribute("stuList", stuList);
		return "student";
	}
	
	@RequestMapping("/page/stu/redis")
	public String showStuListRedis(Model model){
		List<Student> stuList = stuService.getStuListRedis();
		model.addAttribute("stuList",stuList);
		return "student";
	}
}
