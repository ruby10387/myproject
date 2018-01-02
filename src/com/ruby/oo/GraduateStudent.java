package com.ruby.oo;

//繼承語法:GraduateStudent類別繼承Student類別
//沒有寫建構子就會繼承父類別的空的建構子
public class GraduateStudent extends Student{
	int thesis;
	public GraduateStudent(){
		
	}
//確認自己有複寫正確
	@Override
	public void print(){
		System.out.println(pass);
		System.out.println(english+"\t"+math+"\t"
		+chinese+"\t"+thesis);
	}
}
