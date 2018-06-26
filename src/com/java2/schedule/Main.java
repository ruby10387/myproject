package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	/* 有一文字檔儲存了課表資料(schedule.txt)
	 * 請讀取資料後，設計程式可檢查是否有空檔?
	 * 如:
	 * 請輸入星期(1-7):2
	 * 請輸入時(0-24):11
	 * 【有空檔】
	 * 請輸入星期(1-7):4
	 * 請輸入時(0-24):14
	 * 【有課: C004 English 到 16時 】
	 */
	List<Course> courses = new ArrayList<>();
	public Main(){
		readCourses();
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入星期:");
		int weekDay = scanner.nextInt();
		System.out.print("請輸入時:");
		int time = scanner.nextInt();
		boolean avail = true;
		for(Course c:courses) {
			if(!c.isAvailable(weekDay, time)) {
				System.out.println("【有課: "+c.getId()+" "+c.subject+" 到 "+(c.getTime()+c.getDuration())+"時 】");
				avail = false;
				break;
			}
			if(avail) {
				System.out.println("【有空檔】");
				break;
			}
		}
	}
	public void readCourses(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("schedule.txt"));
			String line = in.readLine();
			while(line!=null) {
				String[] tokens = line.split(",");
				String id = tokens[0];
				String subject = tokens[1];
				int weekDay = Integer.parseInt(tokens[2]);
				int time = Integer.parseInt(tokens[3]);
				int duration = Integer.parseInt(tokens[4]);
				Course c = new Course(id, subject, weekDay, time, duration);
				courses.add(c);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
