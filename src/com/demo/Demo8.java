package com.demo;
import java.util.Scanner;

public class Demo8 {
//�������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ݣ�");
		int n = sc.nextInt();
		
		//����һ����ά����
		int[][] arr = new int[n][n];
		
		//����������κ�һ�еĵ�һ�к����һ�и�ֵΪ1
		for(int x = 0;x<arr.length;x++) {
			arr[x][0] = 1;
			arr[x][x] = 1;
		}
		
		for(int x =2;x<arr.length;x++) {
			for(int y = 1;y<x-1;y++) {
				
			}
		}
		
		//���������ά����
		//��ѭ���ı仯�;žų˷�������
		for(int x = 0;x<arr.length;x++) {
			for(int y = 0;y<=x;y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
