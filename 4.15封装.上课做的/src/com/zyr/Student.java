package com.zyr;

public class Student {
	int age;
	String name;
static String school="ด๓ัง";
	public void info(){
		System.out.println("name:"+name+"age:"+age+"school:"+school);
	}
	public Student(int age,String name,String school){
		this.age=age;
		this.name=name;
		this.school=school;
	}
}
