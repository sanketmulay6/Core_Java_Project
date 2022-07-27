package com.cg.interface_;
interface inff{
	void display();
}
class Demo implements inff{
//provides the implementation for abstract method inside Demo class
	@Override
	public void display() {
		System.out.println("Interface program");
		
	}
	
}
public class main {

	public static void main(String[] args) {
	Demo d= new Demo();
	d.display();
	}

}