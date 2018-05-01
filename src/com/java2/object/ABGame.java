package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "9873";
		int length = secret.length();
		int a = 0;
		int b = 0;
		while(a!=4){
			a = 0;
			b = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter your guess:");
			String nums = scanner.nextLine();
			for(int i=0; i<nums.length(); i++){
				for(int j=0; j<secret.length(); j++){
					char c = secret.charAt(j);
					char n = nums.charAt(i);
					if(n==c){
						if(i==j){
							a = a+1;
						}else{
							b = b+1;
						}
					}
				}
			}
			System.out.println(a+"A"+b+"B");
		}
	}

}
