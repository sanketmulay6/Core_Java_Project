package com.cg.annotation;
	class car {
	public void speed(int s) {
	System.out.println("speed is :"+s+"kh/Hr");
}
	}
	class BMW extends car{
	public void speed(int s) {
		//@override
		System.out.println("speed is :"+s+"kh/Hr");
	}
	
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.speed(60);
	}

}