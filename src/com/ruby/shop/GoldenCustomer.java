package com.ruby.shop;

public class GoldenCustomer extends SilverCustomer {
	
	public GoldenCustomer(int amount){
		super(amount);
	}
	@Override
	public void print(){
		int total = (int)(amount*(1-discount));
		int returnMoney = (int)(amount*discount);
		System.out.println(amount+"\t"+total+"\t"+returnMoney);
	}
	
}
