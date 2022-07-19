package com.function.factorial;

import java.util.Scanner;

public class Factorial {
	 static int factorial(int n) {
		 int fact=1;
	for(int i=1;i<=n;i++){
		fact=fact*i;
		}return fact;
		
		}

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.print("Result is :");
		
		System.out.println(factorial(+n));
		s.close();
	}
	

}

