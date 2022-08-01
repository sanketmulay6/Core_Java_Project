package com.cg.exception;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		int [] MyIntArray=new int[]{1,2,3};
		try {
			print(MyIntArray);
			System.out.println("Third Line");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled " +e);
		}

	}
	public static void print (int [] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth element dispalyed successfully");
	}

}