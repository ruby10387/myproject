package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	Random random = new Random();
	String flowers = "SHDC";
	List<Integer> cards = new ArrayList<>();
	public Poker2(){
		for (int i=0;i<cards.size();i++){
			cards.add(i);
			System.out.println((i%13)+i+""+flowers.charAt(i/13));
		}
	}
	
	public void shuffle(){
		for(int i =0; i<cards.size(); i++){
			int r = random.nextInt(52);
			cards.set(i,r);
		}
	}
	public void show(){
		for(int i=0; i<cards.size(); i++){
			int c = cards.get(i);
			System.out.print((c%13)+1+""+(flowers.charAt(c/13))+"");
			if(i%13==0){
				System.out.println();
			}
		}
	}
}
