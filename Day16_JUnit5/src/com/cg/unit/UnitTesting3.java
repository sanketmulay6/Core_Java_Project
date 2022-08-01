package com.cg.unit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UnitTesting3 {
//DisplayName Annotation
	
	@Test
	@DisplayName("Test is successful")
	
	void function ()
	{
		
	System.out.println("Display Name");
	}

	@Test
	@Disabled
	void function1 ()
	{
		
	System.out.println("Display");
	}
}
