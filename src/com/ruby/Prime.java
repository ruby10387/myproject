package com.ruby;

public class Prime {

	public static void main(String[] args) {
		boolean prime = true;
		int i;
		 for(i=2; i<1000 ;i++){
		   for(int n=2; n<i ;n++){
			   if(i%n ==0){
				   prime = false;
				   break;
			   }
		   }
		 }
		if(prime){
		}else{
		}
	}

}
