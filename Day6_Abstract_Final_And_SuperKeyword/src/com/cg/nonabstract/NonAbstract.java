package com.cg.nonabstract;
//non abstract class
class pet{
	void display()
	{
		System.out.println("Pets are cute");
	}
}

final class cat extends pet{// final keyword is used to make the class final
							//final keyword is used to restrict the user
}
public class NonAbstract {

	public static void main(String[] args) {
		cat c=new cat();
		c.display();
	}

}