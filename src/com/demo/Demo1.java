package com.demo;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		Demo1 dx = new Demo1();
		dx.printxing(2,2);//��������
		Demo1.jieguo();
		
		//���۵��õķ����Ǿ�̬or�Ǿ�̬�������õķ������Ǿ�̬����������or������ã������õķ������ǷǾ�̬�����ö������
		/*��ͬ����֮�䣬���۵��÷����ǷǾ�̬���Ǿ�̬����������õķ����ǣ� 
			��̬��������ͨ����������󶼿��Ե�����ͨ������ķ�ʽ������ʹ�ã���Ϊ�����ڷǾ�̬���õķ�ʽ�� 
			�Ǿ�̬��������ֻ��ͨ������ſ��Ե�����*/
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