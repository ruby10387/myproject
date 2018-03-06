package com.java2.object;

public class GlassBottle {
	int price;
	String reliability;
	String insulationEffect;
	private String radiatingTime;
	public GlassBottle() {
		
	}
	public GlassBottle(int price,String reliability,String insulationEffect,String radiatingTime){
		this.price = price;
		this.reliability = reliability;
		this.insulationEffect = insulationEffect;
		this.radiatingTime = radiatingTime;
	}
	public void print() {
		System.out.println(price+"\t"+reliability+"\t"+insulationEffect+"\t"+radiatingTime);
	}
	
}
