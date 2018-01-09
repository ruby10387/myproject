package com.ruby.shop;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
//		Customer c1 = new Customer(1000);
//		c1.print();
//		SilverCustomer c2 = new SilverCustomer(1000);
//		c2.print();
		
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(10000));
		customers.add(new GoldenCustomer(10000));
		for(int i=0; i<customers.size(); i++){
			customers.get(i).print();
		}
//		Customer c1 = new Customer(10000);
//		customers.add(c1);
//		c1.print();
		
		
//		集合可以放不同型態的資料
//		泛型語法指定集合裡資料的型態
		ArrayList<Integer> list = new ArrayList<>();
		list.add(94);
		list.add(84);
		list.add(55);
//		如果沒有指定型態則須轉型
		int n = list.get(2);
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		for (int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
	}

}
