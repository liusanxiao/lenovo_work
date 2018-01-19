package cn.com.lenovo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.lenovo.mapper.StudentMapper;
import cn.com.lenovo.pojo.Student;
import cn.com.lenovo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper stuMapper;
	@Override
	public List<Student> getStuList() {
		
		return stuMapper.getStuList();
	}

}
