package com.ruby.oo;

public class Student {
//	屬性(property,field)在此類別接可用
//  方法(method)
	int english;
	int math;
	int chinese;
	String name;
//	建構子(constructor)方法和類別名稱相同
	public Student (String n, int e, int m, int c){
		english = e;
		math = m;
		chinese = c;
		name = n;
	}
	public void print(){
		System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	}
}
