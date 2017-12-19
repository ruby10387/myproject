package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();
		for(int x=1; x<=10; x++){
			int n1 = r.nextInt(6)+1;
			int n2 = r.nextInt(6)+1;
			int n3 = r.nextInt(6)+1;
			int n4 = r.nextInt(6)+1;
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" ");
			if(n1!=n2&&n2!=n3&&n3!=n4&&n1!=n3&&n1!=n4&&n2!=n4){
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}

}
