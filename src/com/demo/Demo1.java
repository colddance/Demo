package com.demo;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		Demo1 dx = new Demo1();
		dx.printxing(2,2);//单独调用
		Demo1.jieguo();
		
		//无论调用的方法是静态or非静态，被调用的方法若是静态，则用类名or对象调用，被调用的方法若是非静态，则用对象调用
		/*不同的类之间，无论调用方法是非静态还是静态，如果被调用的方法是： 
			静态方法，则通过类名与对象都可以调（但通过对象的方式不建议使用，因为它属于非静态调用的方式） 
			非静态方法，则只能通过对象才可以调用它*/
	}
	
	public static void jieguo() {
		System.out.println("******");
	}
	
	public void printxing(int m,int n) {
		for(int x=0;x<m;x++) {
			for(int y=0;y<n;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}