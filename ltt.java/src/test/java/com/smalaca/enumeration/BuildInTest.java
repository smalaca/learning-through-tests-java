package com.smalaca.enumeration;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BuildInTest {
	
	private String stringValue;
	private TDDStep enumValue;
	private int ordinal;
	
	public BuildInTest(TDDStep enumValue, String stringValue, int ordinal) {
		this.enumValue = enumValue;
		this.stringValue = stringValue;
		this.ordinal = ordinal;
	}
	
	@Parameters
    public static Collection<Object[]> dataProvider() {
    	return Arrays.asList(new Object[][] {
            { TDDStep.RED, "RED", 0},
            { TDDStep.GREEN, "GREEN", 1},
            { TDDStep.REFACTOR, "REFACTOR", 2},
        });
    }

	@Test
	public void stringToEnum() {
		assertEquals(enumValue, TDDStep.valueOf(stringValue));
	}
	
	@Test
	public void enumToString() {
		assertEquals(stringValue, enumValue.toString());
	}
	
	@Test
	public void enumName() {
		assertEquals(stringValue, enumValue.name());
	}
	
	@Test
	public void enumOrdinal() {
		assertEquals(ordinal, enumValue.ordinal());
	}
}
