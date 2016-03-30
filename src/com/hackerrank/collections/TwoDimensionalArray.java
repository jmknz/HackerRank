package com.hackerrank.collections;

import java.util.*;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new  int[6][6];
		for( int i = 0; i < 6; i++ ) {
			for( int j = 0; j < 6; j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		ArrayList<Integer> sumArr = new ArrayList<Integer>();
		for( int i = 0; i < arr.length - 2; i++ ) {
			for( int j = 0; j < arr.length - 2; j++ ) {
				sumArr.add( (arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]) );
//				System.out.println(arr[i][j] + " " + arr[i+1][j] + " " + arr[i+2][j] + " " + arr[i+1][j+1] + " " + arr[i][j+2] + " " + arr[i+1][j+2] + " " + arr[i+2][j+2]);
			}
		}
		System.out.println(Collections.max(sumArr));
//		for( int i = 0; i < sumArr.size(); i++ ) {
//			System.out.println(sumArr.get(i));
//			
//		}
	}
}
