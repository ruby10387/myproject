package com.ruby;

public class DateOfYear {

	public static void main(String[] args) {
		int n = 250;
		int month[] = {31 ,28 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31 };
			for(int x=0; x<month.length ;x++){
				if(n<=month[x]){
					System.out.println(x+1 +" / "+n);
					break;
				}else{
					n = n-month[x];
				}
			}
	}

}
