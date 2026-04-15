package com.zyr;

public class test {
public static void main(String[]args){
	demo d1=new demo();
	d1.setname("huge");
	System.out.println(d1.age);
	System.out.println(d1.getname());
	demo d2=new demo(10);
	System.out.println(d2.age);
	
	person p1=new person();
	p1.month2();
			}
		}
