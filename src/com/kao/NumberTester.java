package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			if(i%3==0){
				System.out.print(i+" ");
			}
			if(i%15==0){
				System.out.println();
			}
		}
	}

}
