package com.java2.threading;

public class HorseRunable implements Runnable{
//一個類別不能繼承多於一個的類別(如:一個小孩只能有一個老爹),但又想使用多執行緒,我們可以以實施一個介面的方式去做
	@Override
	public void run() {
		for(int i=0;i<=100;i++){
			System.out.println("R:"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
