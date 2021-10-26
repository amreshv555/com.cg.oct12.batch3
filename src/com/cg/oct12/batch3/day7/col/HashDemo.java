package com.cg.oct12.batch3.day7.col;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashDemo {
	public static void main(String[] args) {
       	ArrayList obj1 = new ArrayList();
       	HashSet obj2 = new HashSet();
 
       	Random r = new Random();
       	for (int i = 1; i <= 10; i++) {
            	int num = r.nextInt(5);
            	obj1.add(num);
            	obj2.add(num);
       	}
     System.out.println("List : " + obj1); // allow duplicates
     System.out.println("Set : " + obj2); // doesn't allow duplicates
 	}
}


