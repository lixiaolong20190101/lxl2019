package com.yidu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yidu.bean.Score;
import com.yidu.bean.Student;
import com.yidu.service.StudentService;

public class TestCase {

	public static void main(String[] args) {
		Student student=new Student();
	/*	student.setName("��С��");
		student.setAge(60);
		student.setSex("��");*/
		//����spring�������ģ�������
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//�������еõ�ѧ������
		//Student stu = (Student)context.getBean("student001");
		//System.out.println(stu.toString());
		/*Score s=(Score)context.getBean("score");
		System.out.println(s.toString());*/
		StudentService service=(StudentService) context.getBean("userService");
		service.update(99);

	}

}
