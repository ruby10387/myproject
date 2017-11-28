package com.ruby;

public class BubleSort {

	public static void main(String[] args) {
		int n[] = {51 ,23 ,6 ,65 ,15 };
		for(int i=0;i<4;i++){
			for(int i2=i+1;i2<5;i2++){
				if(n[i]>n[i2]){
					int tmp = n[i];
					n[i] = n[i2];
					n[i2] = tmp;
				}
			}
		}
		for(int i=0;i<5;i++){
		System.out.print(n[i]+" ");
		}
	}

}
