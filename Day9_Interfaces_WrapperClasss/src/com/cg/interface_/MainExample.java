package com.cg.interface_;
interface vehicle{
	//abstract method
	void speed ();
}
//when we use two interface and we are going to access one interface from another interface 
//then always use extends keyword.
interface Car extends vehicle{
	public abstract void engine();
}

class bus implements vehicle{
	public void engine() {
		System.out.println("Petrol");
	}

	@Override
	public void speed() {
		System.out.println("Speed is 40");
		
	}
	
}
public class MainExample {

	public static void main(String[] args) {
		bus b=new bus();
		b.engine();
		b.speed();

	}

}