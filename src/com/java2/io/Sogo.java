package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ruby.shop.Customer;
import com.ruby.shop.GoldenCustomer;
import com.ruby.shop.SilverCustomer;

public class Sogo {
	Scanner scanner = new Scanner(System.in);
	public Sogo(){
			
		}
	
	public void start(){
		int function = 0;
		while(function!=3){
			showFuntions();
			function = scanner.nextInt();
			switch(function){
			case 1:
				inputSales();
				break;
			case 2:
				List<Sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Customer customer = Customer.getCustomer(type,amount);
							Sales sales = new Sales(type, amount);
							list.add(sales);
						} catch (NumberFormatException e) {
							System.out.println("資料格式錯誤");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				for (Sales sales: list){
					Customer customer = null;
					customer.print();
				}
				break;
			case 3:
				return;
			
			}
		}
	}
	public void inputSales(){
		try {
			FileOutputStream fos = new FileOutputStream("sale.txt", true);
			PrintStream out = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int type = scanner.nextInt();
			System.out.print("請輸入銷售金額:");
			int amount = scanner.nextInt();
			out.print(type+"\t"+amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void showFuntions(){
		System.out.println("請輸入功能(1~3):");
		System.out.println("1)輸入銷售紀錄");
		System.out.println("2)印出銷售報表");
		System.out.println("3)結束程式");
	}
	
	public static void main(String[] args) {
		Sogo sogo = new Sogo();
		sogo.start();
	}
}
