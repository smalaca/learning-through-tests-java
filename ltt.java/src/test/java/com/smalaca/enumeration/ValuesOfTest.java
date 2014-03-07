package com.smalaca.enumeration;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValuesOfTest {

	@Test
	public void valuesOfEnum() {
		TDDStep[] steps = {TDDStep.RED, TDDStep.GREEN, TDDStep.REFACTOR};
		
		assertArrayEquals(steps, TDDStep.values());
	}
}
