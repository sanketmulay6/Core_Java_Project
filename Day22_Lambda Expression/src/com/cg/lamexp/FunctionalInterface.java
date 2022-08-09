package com.cg.lamexp;
//Functional Interface
interface A{
	//zero-parameter abstract method
	void show();
	
}
/*class B implements A{
	@Override
	public void show(){
		System.out.println("program on to implement functional interface using lambda expression");
	}
}*/
public class FunctionalInterface {

	public static void main(String[] args) {
		//B b=new B();
		//b.show();
		//lambda expression
		A a=()->{
			System.out.println("program on to implement functional interface using lambda expression");
		};
		a.show();
	}

}