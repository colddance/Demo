package com.demo;

public class Demo4 {
//数组逆序
	public static void main(String[] args) {
		int[] e = {11,22,33,44,55};
		printArray(e);
		
		reverse(e);
		printArray(e);
		

	}
	
	public static void reverse(int[] arr) {
		for(int x = 0;x<arr.length/2;x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) { //这是最后一个元素
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}

}
