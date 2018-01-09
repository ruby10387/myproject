package com.ruby.aa;

public class Ticket {
	String date;
	String time;
	String departure;
	String destination;
	int price;
	
	public Ticket(String date,String time,String departure,String destination,int price){
		this.price = price;
	}
	
	public void print(){
		System.out.println(date+"\t"+time+"\t"+departure+"\t"+destination+"\t"+price);
	}
	
}
