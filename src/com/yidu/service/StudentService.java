package com.yidu.service;

public class StudentService {
	public void save() {
		System.out.println("保存用户!");
	}
	public void delete() {
		System.out.println("删除用户!");
	}
	public void update(int i) {
		i=i/0;
		System.out.println("更新用户!");
	}
	public void find() {
		System.out.println("查找用户!");
	}

}
