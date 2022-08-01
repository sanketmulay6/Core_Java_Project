package com.cg.exception;

import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
	
	try {
			int res=x/0;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();

	}

}