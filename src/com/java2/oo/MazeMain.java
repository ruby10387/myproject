package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {

	public static void main(String[] args) {
		new MazeMain();
	}
	
	public MazeMain(){
		FileReader fr;
		try {
			fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String tokens[] = line.split(",");
			int row,col = Integer.parseInt(tokens[0]);
			int trapCount = Integer.parseInt(tokens[1]);
			line = in.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	class Maze {
		int row,col;
		int trapCount;
		int[] traps;
		Player player;
		public Maze(int row, int col, int trapCount) {
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;
		}
	}
	
	class Player {
		int hp = 100;
		int pos = 0;
	}

}
