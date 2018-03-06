package com.java2.object;

public class ThermosBottle extends GlassBottle{
	private String insulatedTime;
	public ThermosBottle() {
	
	}
	@Override
	public void print() {
		System.out.println(price+"\t"+reliability+"\t"+
				insulationEffect+"\t"+insulatedTime);
	}
}
