package com.cg.unit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class UnitTesting4 {
    @Test
	@AfterAll
	static void display() {
		
		System.out.println("Morning");
	}
	@Test
	@AfterEach
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
