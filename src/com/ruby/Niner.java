package com.ruby;

public class Niner {

	/*
	   2 x 1 =  2
	   2 x 2 =  4 
	   2 x 3 =  6
	   2 x 4 =  8 
	   2 x 5 = 10 
	   2 x 6 = 12 
	   2 x 7 = 14
	   2 x 8 = 16 
	   2 x 9 = 18
	*/
	public static void main(String[] args) {
		  for (int i=1; i<=9 ;i=i+1){
		   if ((2*i) <10){ System.out.println("2 x "+ i + " =  " + (2*i)); 
		      }else{ 
		        System.out.println("2 x " + i + " = " + (2*i));
		      } 
          }
		  System.out.println(" ");
//        九九乘法表		
//		  int n = 2;
		  for (int n=2; n<10 ;n=n+1){
			  for (int i=1; i<=9 ;i=i+1){
				  System.out.print(n + " x " + i + " = ");
				  if ((n*i) < 10){
					  System.out.print(" ");
				  }
				  System.out.println((n*i));
			  }
			  System.out.println();
		  }
	}
}
