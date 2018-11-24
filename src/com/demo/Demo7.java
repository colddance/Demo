package com.demo;

public class Demo7 {

	public static void main(String[] args) {
		int[][] arr = {{22,33,44},{66,77,88},{25,34,69}};
		int sum = 0;
		for(int x = 0;x<arr.length;x++) {
			for(int y = 0;y<arr[x].length;y++) {
				System.out.println(arr[x][y]);
				sum+=arr[x][y];
			}
		}
		System.out.println(sum);

	}

}
