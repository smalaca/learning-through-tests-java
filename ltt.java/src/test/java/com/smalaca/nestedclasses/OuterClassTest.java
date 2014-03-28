package com.smalaca.nestedclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class OuterClassTest {

	@Test
	public void createInstanceOfStaticNestedClass() {
		assertTrue(new OuterClass.StaticNestedClass().amINested());
	}
	
	@Test
	public void createInstanceOfInenerClass() {
		OuterClass outer = new OuterClass();
		
		assertTrue(outer.new InnerClass().amIInner());
		assertTrue(new OuterClass().new InnerClass().amIInner());
	}
}
