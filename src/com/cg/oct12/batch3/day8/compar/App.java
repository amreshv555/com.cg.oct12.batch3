package com.cg.oct12.batch3.day8.compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {

//		Comparable<T>

//		Comparator<T>

//		Map<Integer,String> map =new HashMap<>();
//		map.put(10,"AM");
//		map.put(20,"PM");
//		map.put(30, "Cm");
//		System.out.println(map);
//		
//		map = new LinkedHashMap<>();
//		System.out.println(map);

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 10.6));
		empList.add(new Employee(102, "Monu", 20.6));
		empList.add(new Employee(103, "Tonu", 40.6));
		empList.add(new Employee(104, "Ponu", 30.6));
		System.out.println(empList);
		
		System.out.println("Before sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		Collections.sort(empList, new SortBySalary());
		System.out.println("After sort");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		System.out.println(empList);

//		List<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		list = new LinkedList<>();
//		list = new Stack<>();
//
//		ArrayList<Integer> list2 = new ArrayList<>();
//		System.out.println(list2);
////		list2 = new LinkedList<>();
	}
}
