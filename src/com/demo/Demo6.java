package com.demo;

public class Demo6 {

	public static void main(String [] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		//二维数组的遍历
		/*for(int x = 0;x<arr[0].length;x++) {
			System.out.println(arr[0][x]);
		}
		for(int x = 0;x<arr[1].length;x++) {
			System.out.println(arr[1][x]);
		}
		for(int x = 0;x<arr[2].length;x++) {
			System.out.println(arr[2][x]);
			System.out.println(arr.length);
		}*/
		for(int y = 0;y<arr.length;y++) {
			for(int x = 0;x<arr[y].length;x++) {
				System.out.println(arr[y][x]);
			}
		}
		
	}

}
