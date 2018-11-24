package com.demo;
import java.util.Scanner;

public class Demo8 {
//杨辉三角
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int n = sc.nextInt();
		
		//定义一个二维数组
		int[][] arr = new int[n][n];
		
		//给这个数组任何一行的第一列和最后一列赋值为1
		for(int x = 0;x<arr.length;x++) {
			arr[x][0] = 1;
			arr[x][x] = 1;
		}
		
		for(int x =2;x<arr.length;x++) {
			for(int y = 1;y<x-1;y++) {
				
			}
		}
		
		//遍历这个二维数组
		//内循环的变化和九九乘法表相似
		for(int x = 0;x<arr.length;x++) {
			for(int y = 0;y<=x;y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
