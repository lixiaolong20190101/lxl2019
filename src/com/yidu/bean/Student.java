package com.yidu.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	private int age;
	private String sex;
	private String [] like;
	private List<String> likeList;
	private Map<String,String> likeMap;
	private Score score;
	
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public Map<String, String> getLikeMap() {
		return likeMap;
	}
	public void setLikeMap(Map<String, String> likeMap) {
		this.likeMap = likeMap;
	}
	public String[] getLike() {
		return like;
	}
	public void setLike(String[] like) {
		this.like = like;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getLikeList() {
		return likeList;
	}
	public void setLikeList(List<String> likeList) {
		this.likeList = likeList;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", like=" + Arrays.toString(like)
				+ ", likeList=" + likeList + ", likeMap=" + likeMap + ", score=" + score + "]";
	}
	



	

}
