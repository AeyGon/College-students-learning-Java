package com.zyr;

public class test2 {
	public static void main(String[]args){
		
		Student s1=new Student(18,"huge");
		Student s2=new Student(18,"juge");
		Student s3=new Student(18,"Zyr");
		Student s4=new Student(18,"Zyr");
		s1.info();
		s2.info();
		s3.info();
		s4.info();
		System.ou.println("某一个学生修改的学校名称");
		s1.school="清华大学";
		s1.info();
		s2.info();
		s3.info();
		s4.info();
		
	}
	
}
