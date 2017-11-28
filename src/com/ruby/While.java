package com.ruby;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
          int i=1;
          while(i<=5){
        	  System.out.println(i);
        	  i++;
          }
          System.out.println("Please enter a number:");
  		  Scanner scanner = new Scanner(System.in);
  		  String line = scanner.nextLine();
  		  int n = Integer.parseInt(line);
  		  int x = 1;
  		  while(x<=n){
  			  System.out.print(x);
  			  x++;
  		  }
	}

}
