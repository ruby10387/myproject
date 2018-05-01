package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
//		只能new出它的小孩
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(1);
		System.out.println(list);
//		Set不能重複且Hash沒有排序
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(4);
		set.add(3);
		set.add(1);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("Jack");
		set2.add("Ruby");
		set2.add("Hank");
		set2.add("Jack");
		System.out.println(set2);
//		Map的Key不能重複,Value可以重複
//		TreeMap有順序
		Map<String, String> stocks = new HashMap<>();
		stocks.put("2330","台積電" );
		stocks.put("2317","鴻海" );
		stocks.put("2454","Mediatek" );
		System.out.println(stocks);
	}

}
