package com.yidu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.bean.Score;

@Service
public class StudentService {
	public void save() {
		System.out.println("�����û�!");
	}
	@Autowired
	private Score score;
	public void delete(String name) {
		score.setHtml(99);
		System.out.println(score.toString());
		System.out.println("ɾ���û�!");
	}
	public void update(int i) {
		i=i/0;
		System.out.println("�����û�!");
	}
	public void find() {
		System.out.println("�����û�!");
	}

}
