package com.cg.assignment2;

import java.util.Scanner;

class Sum_Recursion
{
	static int sum_of_digit(int n)
	{
		if (n == 1)
			return 1;
		else
		return (n % 10 + sum_of_digit(n / 10));
	}

	public static void main(String args[])
	{
		Scanner x= new Scanner (System.in);
		int n=x.nextInt();
		int num = n;
		int result = sum_of_digit(num);
		System.out.println("Sum of digits in " +
						num + " is " + result);
	}
}