package com.cg.enum1;

interface Pizza{
	
	void display();
}
enum size implements Pizza{
	small,regular,medium,large;

	@Override
	public void display() {
		System.out.println("You ordered "+this+" Size Pizza.");
		
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.small.display();
	}

}