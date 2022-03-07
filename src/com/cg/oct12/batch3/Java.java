package com.cg.oct12.batch3;

public class Java {
	static  float result;

	public static void main(String[] args) {
		float c=5f;
		float t=2f;
		result = c/t;
		System.out.println(result);
		int i1=10;
		int i2=10;
		String s1="Hello";
		String s2=new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(i1==i2);
		int[] d= {1,1,1,2,2,2,2,};
		System.out.println(d.length);
		byte b1=10;
		byte b2=20;
	//	byte b3=(byte) (b1+b2);
		System.out.println(b1+b2);
		System.out.println(b1+b2);
		Short i9=10;
		Short i8=20;
		Short i7=(short) (i8+i9);
		System.out.println(i7);
		String s ="10";
		String s7="20";
		int l1= Integer.parseInt(s);
		int l2= Integer.parseInt(s7);
		System.out.println(l1+l2);
	}

}
