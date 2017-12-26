package com.ruby.oo;

public class Student {
//	屬性(property或field)在此類別接可用
//	instance variable(物件階層)
	int english;
	int math;
	int chinese;
	String name;
//	class variable(類別階層)
	static int pass = 60;
	
//	建構子(constructor),方法和類別名稱相同
//	沒有寫建構子會自動附贈一個空的建構子,寫了建構子就不會有空的建構子
	public Student(){
		
	}
//	local variable
//	property和local variable名稱可相同,但為不同的資料
//	this可用在property和method
	public Student (String name, int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.name = name;
	}
	public Student (String name){
		this.name = name;
	}
	

//	static method只能用static成員
	public static void method(){
		System.out.println("Hello");
	}
//  方法(instance method)
	public void print(){
		System.out.println(pass);
		System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	}
}
