package com.ruby;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
        int age = 0;
        float weight = 69.5f;
        char c = 65;
        char c2 = 'Z';
        int i = c2;
        System.out.println(i);        
        System.out.println((int)c2);
        boolean pass = false;
        System.out.println(!pass);
        System.out.println(pass);
        
        String s = new String("Hello");
        
        Random r = new Random();
        System.out.println(r.nextInt(6)+1);
        System.out.println(4>3);
        System.out.println(3<=2);
        System.out.println(5==5);
        
        
	}

}
