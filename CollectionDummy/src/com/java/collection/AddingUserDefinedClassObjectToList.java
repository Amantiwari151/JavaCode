package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.java.entity.Student;

public class AddingUserDefinedClassObjectToList {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(2,19,"Ajay");
		Student s2 = new Student(3,22,"Jay");
		Student s3 = new Student(6,7,"Rohan");
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			Student student = (Student)iterator.next();
		}
	}
}
