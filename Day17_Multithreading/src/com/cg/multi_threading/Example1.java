package com.cg.multi_threading;

	public class Example1 extends Thread{
	public void run() {
	System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
	Example1 e= new Example1();
	e.start();
	
	}

}