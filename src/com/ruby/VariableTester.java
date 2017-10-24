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
        int n1 = r.nextInt(6)+1;
        int n2 = r.nextInt(6)+1;
        int n3 = r.nextInt(6)+1;
        System.out.println(4>3);
        System.out.println(3<=2);
        System.out.println(5==5);
        
        
        String s1 = new String("Hello");
        String s2 = "HAHAHAHAHAHAHA";
        int len = s1.length();
        System.out.println("len:"+len);
        System.out.println(s1.charAt(0));
        
        float w = 5.0f;
        int x = 5;
        int y = 3;
        int z = x / y;
        float z2 = w / y;
        System.out.println(z);
        System.out.println((int)w / y);
        System.out.println(z2);
        System.out.println(x << 1);
        System.out.println(x >> 1);
        x = x + 1;
        System.out.println(x);
        x--;
        System.out.println(x);
        x += 2;
        System.out.println(x);
        
	}

}
