package com.ruby;

public class Number {

	public static void main(String[] args) {
	/*1 2 3 4 5 6 7 8 9 10 11 12 13
	     三的倍數不印   
	*/	
			for(int x=1; x<=13 ;x++){
				if(x%3 == 0){
					continue;
				}
				System.out.print(x + " ");
			}
	}

}
