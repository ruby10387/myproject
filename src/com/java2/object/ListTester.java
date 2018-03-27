package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(6);
		cards.add(23);
		cards.add(14);
		cards.set(1,87);
		System.out.println("removing number:"+cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(1));
	}

}
