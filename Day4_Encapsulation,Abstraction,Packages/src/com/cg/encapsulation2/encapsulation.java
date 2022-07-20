package com.cg.encapsulation2;

import com.cg.encapsulation1.UBI;

public class encapsulation {

	public static void main(String[] args) {

		UBI s=new UBI();
	
		s.setATM_PIN(1234);
		s.getATM_PIN();
		System.out.print("ATM PIN:"+s.ATM_PIN);
	
	}

}