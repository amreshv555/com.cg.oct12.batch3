package com.cg.oct12.batch3;

public class Test3 {
	int counter;
	Test3(){
		counter++;
		System.out.println(counter);
	}
	final public static void tes() {
		System.out.println("Im the test");
	}

	

} 
class A extends Test3 {
	
	public static void main(String[] args) {
		
		tes();
		
	}
	
}
