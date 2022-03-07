package com.cg.oct12.batch3.day8.fun;

////2. abstract method usage - by anonymous inner class

public class App {
	public static void main(String[] args) {
		// 3. abstract method usage - using lambda expression (only with functional interface)
		FunIn obj = () -> {
			System.out.println("functionalMethod");
		};
		obj.functionalMethod();

		
		
//		FunIn obj = new FunIn() {
//			@Override
//			public void anotherAbstractMethod() {
//				System.out.println("anotherAbstractMethod");
//			}
//
//			@Override
//			public void abstractMethod() {
//				System.out.println("abstractMethod");
//			}
//		};
//
//		obj.abstractMethod();
//		obj.anotherAbstractMethod();

}
}
