package com.cg.interface_;
interface Mother {
	void display();
}
interface Father{
	void print();
}
class Son implements Mother,Father{

	@Override
	public void display() {
		System.out.println("my Mother cookss tatsty food");
	}
		
		@Override
		public void print() {
			System.out.println("my Father is caring");
			
		}
	
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		Son s= new Son();
		s.display();
		s.print();

	}

}