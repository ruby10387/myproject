package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try{
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.write(99);
			out.write(116);
			out.flush();
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("File NOT FOUND!!!");
		} catch (IOException e) {
			System.out.println("File Exception Problem!!!");
		}
	}

}
