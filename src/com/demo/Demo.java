package com.demo;
import java.util.Scanner;
public class Demo {
public static void main (String[] args) {
	//输出九九乘法表
	/*for(int x = 1;x<=9;x++) {
		for(int y = 1;y<=x;y++) {
			System.out.print(y+"*"+x+"="+x*y+"\t");
		}
		System.out.println();
	}*/
	
	/*小芳的妈妈每天给她2.5元钱，她都会存起来，
	 * 但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
	 * 请问，经过多少天，小芳才可以存到100元钱。*/
	double daymoney = 2.5;
	double summoney = 0;
	int days = 1;
	double result = 100;
	while(true) {
		summoney+=daymoney;
		if(days%5==0) {
			summoney-=6;
			System.out.println(days+"天花了6元钱");
		}
		if(summoney>=result) {
			System.out.println("共花了"+days+"天存储");
			break;
		}
		days++;
	}
	
	
	/*int count = 0;
	int start = 1;
	int end = 884800;
	while(start<end) {
			count++;
		start*=2;
		System.out.println(start);
	}
	System.out.println(count);*/
	//输出水仙花数
	/*for(int x = 100;x<1000;x++) {
		int ge = x % 10;
		int shi = x/10%10;
		int bai = x/10/10%10;
		if(x==(ge*ge*ge+shi*shi*shi+bai*bai*bai)) {
			System.out.println(x);
		}
	}*/
	/*int count = 0;
	for(int x = 1;x<=1000;x++) {
		if((x%3==2)&&(x%5==3)&&(x%7==2)) {
			count++;
		}
	}
	System.out.println(count);*/
}
}
