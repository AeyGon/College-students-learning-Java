package com.zyr;

public class demo {
int age;
String color;
private	String name;
public void setname(String name){
	if(name==null|| name.trim().isEmpty()){
		System.out.println("名字不能为空，或者不能是全部空格");
	}else{
		this.name=name;
	}
}
public String getname(){
	return name;
}
public demo(){
	this(2,"红色");//调用一个带整型变量的参数
}
public demo(int age){
	this.age=age;
	System.out.println("调用有参的构造方法");
}
public demo(int age,String color){
	this.age=age;
	this.color=color;
}
}
