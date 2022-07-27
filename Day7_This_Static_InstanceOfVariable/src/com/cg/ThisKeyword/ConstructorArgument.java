package com.cg.ThisKeyword;
//2.this keyword is used to  pass an argument in constructor call.
public class ConstructorArgument {
	int num;
	public ConstructorArgument(int num){
		
	}
void main(int num) {
	num=num;
	
}
	public static void main(String[] args) {
		ConstructorArgument c=new ConstructorArgument(5);
		System.out.println("num value:" +c.num);
		
		
	}

}