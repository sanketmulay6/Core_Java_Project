package com.cg.unit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTesting2 {
    @Test
	@BeforeAll
	static void display() {
		
		System.out.println("Morning");
	}
	@Test
	@BeforeEach
	void show()
	{
		
	System.out.println("Hey");
	}
    @Test
	void show1()
	{
		
	System.out.println("Bye");
	}
  
    @Test
    void show2()
	{
		
	System.out.println("Okay");
	}

}

