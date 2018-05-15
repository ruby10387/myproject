package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		Horse h2 = new Horse();
		Horse h3 = new Horse();
		h1.start();
		h2.start();
		h3.start();
		try {
			h1.join();
			h2.join();
			h3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
		
//		Horse h1 = new Horse();
//		h1.start();
//		HorseRunable h2 = new HorseRunable();
//		Thread thr = new Thread(h2);
//		thr.start();
//		try {
//			h1.join();
//			thr.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		List <Horse> horses = new ArrayList<>();
//		for(int i=0;i<8;i++){
//			Horse h = new Horse();
//			horses.add(h);
//			h.start();
//		}
		
	}

}
