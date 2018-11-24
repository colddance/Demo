package com.demo;

public class Demo2 {
	public static void main(String[] args) {
		byte b1 = 3;
		byte b2 = 4;
		System.out.println(compare(b1,b2));
		
		short s1 = 5;
		short s2 = 5;
		System.out.println(compare(s1,s2));
		
		int i1 = 6;
		int i2 = 7;
		System.out.println(compare(i1,i2));
		
		long l1 = 8;
		long l2 = 8;
		System.out.println(compare(l1,l2));
	}
	
	public static boolean compare(byte a,byte b) {
		System.out.println("byte");
		return a==b;
	}
	
	public static boolean compare(short a,short b) {
		System.out.println("short");
		return a==b;
	}
	
	public static boolean compare(int a,int b) {
		System.out.println("int");
		return a==b;
	}
	
	public static boolean compare(long a,long b) {
		System.out.println("long");
		return a==b;
	}
}
