package cn.com.lenovo.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import cn.com.lenovo.mapper.StudentMapper;
import cn.com.lenovo.pojo.Student;
import cn.com.lenovo.service.StudentService;
import cn.com.lenovo.utils.JsonUtils;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper stuMapper;
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Override
	public List<Student> getStuList() {
		
		return stuMapper.getStuList();
	}
	@Override
	public List<Student> getStuListRedis() {
		//从redis中获取数据
		try {
			String stuList = redisTemplate.opsForValue().get("stuList");
			if(StringUtils.isNotBlank(stuList)){
				return JsonUtils.jsonToList(stuList, Student.class);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//从数据库中获取数据
		List<Student> stuList = stuMapper.getStuList();
		
		//将数据添加到redis中
		try {
			redisTemplate.opsForValue().set("stuList", JsonUtils.objectToJson(stuList));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stuList;
		
	}

}
