package com.java.entity;

public class Student {
	
	int rollNo;
	int age;
	String name;
	
	public Student(int rNo,int age,String name) {
		this.rollNo = rNo;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}
	
}
