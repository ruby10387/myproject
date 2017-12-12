package com.ruby.oo;

public class Student {
//	屬性(property或field)在此類別接可用
//	instance variable
//  方法(method)
	int english;
	int math;
	int chinese;
	String name;
	
//	建構子(constructor),方法和類別名稱相同
//	vocal variable
	public Student (String name, int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.name = name;
	}
	
	public Student (String name){
		this.name = name;
	}
//	property和vocal variable名稱可相同,但為不同的資料
//	this可用在property和method
	public void print(){
		System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	}
}
