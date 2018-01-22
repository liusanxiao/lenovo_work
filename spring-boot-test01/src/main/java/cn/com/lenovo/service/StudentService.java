package cn.com.lenovo.service;

import java.util.List;

import cn.com.lenovo.pojo.Student;

public interface StudentService {
	public List<Student> getStuList();

	public List<Student> getStuListRedis();
}
