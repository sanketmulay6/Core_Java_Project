package com.cg.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UnitTesting6 {
	@Disabled
	@Test
	void trueAssumption() {
		assumeTrue(5>2);
		assertEquals(7,2+5);
	}
	
	@Test
	void falseassumption() {
	assumeFalse(4>8);
	}
	
	@Test
	void assumptionThat() {
		String str="RAJ";
		assumingThat(str.equals("raj"),
				()->assertEquals(5,2+3));
		
	}
}