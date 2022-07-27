package com.cg.array;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value");
		int size=s.nextInt();
		int arr[]=new int [10];
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter" + i + "value");
			arr[i]=s.nextInt();
		}
for (int x:arr) {
	System.out.print(x+" ");
}
	}

}