package com.ruby;

public class NinerHorizontal {
	public static void main(String[] args) {
		for(int x = 1; x<10 ;x++){
		    for(int y=2; y<6 ;y++){
		    	System.out.print(y + "x" + x + "=" + (x*y) + "\t");
		    }
		    System.out.println();
		}    
	}
}
