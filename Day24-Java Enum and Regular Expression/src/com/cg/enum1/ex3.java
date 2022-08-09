package com.cg.enum1;
enum Bike{
	Pulsur,KTM,Honda,Hundai
}

public class ex3 {

	public static void main(String[] args) {
		Bike b=Bike.KTM;
		switch(b) {
		case Pulsur:
			System.out.println("you choose Pulsur and Price is 100000Rs");
			break;
		case KTM:
			System.out.println("you choose KTM andPrice is 200000Rs");
			break;
		case Honda:
			System.out.println("you choose Honda andPrice is 150000Rs");
			break;
		case Hundai:
			System.out.println("you choose Hundai and Price is 1000000Rs");
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}
	}

}