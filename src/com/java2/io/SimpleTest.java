package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleTest {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream ("file.txt");
		out.print("Ruby\t01\t500");
		out.flush();
		out.close();
	}

}
