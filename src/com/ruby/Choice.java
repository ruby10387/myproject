package com.ruby;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
         System.out.println("以下誰的年紀最大?");
         System.out.println("1) 周杰倫");
         System.out.println("2) 蔡辰宇");
         System.out.println("3) 梁朝偉");
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
         int n = Integer.parseInt(line);
         if(n == 3){
        	 System.out.println("good");
         }else{
        	 System.out.println("wrong");
         }
	}
}
