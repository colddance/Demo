package com.demo;

public class Demo3 {
	public static void main (String[] args) {
		Demo3 e = new Demo3();
		int[] arr =new int[] {81,23,34,47};
		int[] arr2 = {89,96,36,25};
		int max = e.getmax(arr2);
		int min = getmin(arr);
		System.out.println(max);
		System.out.println(min);
		/*int max = arr[0];
		for(int x = 1;x<arr.length ;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		System.out.println(max);
	}*/
}	
	public static int getmax(int[] arr) {
		int max = arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		return max;
	}
	
	public static int getmin(int[]arr) {
		int min = arr[0];
		for(int x=1;x<arr.length ;x++) {
			if(arr[x]<min) {
				min=arr[x];
			}
		}
		return min;
	}

}