package com.java2.object;

import java.util.Random;

public class Poker {

	Random random = new Random();
	int n[] = new int[52];
	String a = "SHDC";
	public Poker(){
		for (int i=0;i<n.length;i++){
			n[i] = i;
			System.out.println((i%13)+i+""+a.charAt(i/13));
		}
	}
	
	public void shuffle(){
		for(int i =0; i<n.length; i++){
			int r = random.nextInt(52);
			int temp = n[i];
			n[i] = n[r];
			n[r] = temp;
		}
	}
	public void show(){
		for(int i=0; i<n.length; i++){
			int c = n[i];
			System.out.print((c%13)+1+""+(a.charAt(c/13))+"");
			if(i%13==0){
				System.out.println();
			}
		}
	}
}
