package com.cg.oct12.batch3.day7.col;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"tom");
		map.put(2,"dom");
		map.put(3,"com");
		map.put(4,"rom");
		
		
		System.out.println(map);
		LinkedHashMap<Integer,String> li = new LinkedHashMap<>(map);
		System.out.println(li);
		
		
		
		Set<?> s = map.entrySet(); 
		
		for(Object m : s) {
			System.out.println(m);
		}
	}

}
