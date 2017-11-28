package com.ruby;
/*score 為分數
分數介於 0-59 印 Failed
分數介於 60-69 印 Passed
分數介於 70-79 印 Good
分數介於 80-89 印 Great
分數介於 90-100 印 Excellent
*/
public class ScoreTester {

	public static void main(String[] args) {
		int score = 68;
		int level = score/10;
		switch(level){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("Good");
			break;
		case 8:
			System.out.println("Great");
			break;
		default:
			System.out.println("Excellent");
		}
	}

}
