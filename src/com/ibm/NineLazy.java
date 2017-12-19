package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for(int x=1;x<=9;x++){
			for(int y=2;y<=9;y++){
				if(3<x&&x<9){
					  System.out.print("..."+"\t");
				  }else{
					  System.out.print(y + "*" + x + "=");
					  if ((y*x) < 10){						  
						  System.out.print(" ");
					  }
					  System.out.print((y*x)+"\t");
				  }
			}
			System.out.println();
		}
	}

}
