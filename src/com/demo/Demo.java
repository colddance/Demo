package com.demo;
import java.util.Scanner;
public class Demo {
public static void main (String[] args) {
	//����žų˷���
	/*for(int x = 1;x<=9;x++) {
		for(int y = 1;y<=x;y++) {
			System.out.print(y+"*"+x+"="+x*y+"\t");
		}
		System.out.println();
	}*/
	
	/*С��������ÿ�����2.5ԪǮ���������������
	 * ���ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ��
	 * ���ʣ����������죬С���ſ��Դ浽100ԪǮ��*/
	double daymoney = 2.5;
	double summoney = 0;
	int days = 1;
	double result = 100;
	while(true) {
		summoney+=daymoney;
		if(days%5==0) {
			summoney-=6;
			System.out.println(days+"�컨��6ԪǮ");
		}
		if(summoney>=result) {
			System.out.println("������"+days+"��洢");
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
	//���ˮ�ɻ���
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
