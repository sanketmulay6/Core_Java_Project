package com.cg.array;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter outside the  array size");
		int m=s.nextInt();
		System.out.println("Enter inside the array size");
		int n=s.nextInt();
		int arr[][] = new int[m][n];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
		}
	}

}