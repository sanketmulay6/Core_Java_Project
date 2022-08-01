package com.cg.exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		try {
			//int res=15/x;
			System.out.println("hi");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled " +e);
		}
		finally {
			int res=15/x;
			System.out.println(res);
			System.out.println("Whether any exception occur or not, the finally block");
		}
		
		s.close();

	}

}