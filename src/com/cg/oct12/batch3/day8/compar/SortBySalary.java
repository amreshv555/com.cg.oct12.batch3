package com.cg.oct12.batch3.day8.compar;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("compare");
		return (int) (o1.salary - o2.salary);
	}


}
