package com.cg.interface_;
interface InterfaceExanple{
	//by default its abstract method
	void display();
}
class x implements InterfaceExanple{
	//provides the implementation for abstract method inside Demo class
	@Override
	public void display() {
		System.out.println("InterfaceExanple");
	}
}
