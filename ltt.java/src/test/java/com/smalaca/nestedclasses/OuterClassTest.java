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
	
	@Test
	public void shadowing() {
		String innerName = "Inner";
		String outerName = "Outer";
		OuterClass.InnerClass inner = new OuterClass(outerName).new InnerClass(innerName);

		assertSame(innerName, inner.getName());
		assertSame(outerName, inner.getOuterName());
	}
}
