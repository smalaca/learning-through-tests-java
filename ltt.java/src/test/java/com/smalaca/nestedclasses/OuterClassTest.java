package com.smalaca.nestedclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class OuterClassTest {

	@Test
	public void createInstanceOfStaticNestedClassWithoutInstanceOfOuter() {
		assertTrue(new OuterClass.StaticNestedClass().amINested());
	}
//	
//	@Test
//	public void createInstanceOfStaticNestedClassWithInstanceOfOuter() {
//		assertTrue(new OuterClass.new StaticNestedClass().amINested());
//	}
	
	@Test
	public void createInstanceOfInenerClassWithInstanceOfOuter() {
		assertTrue(new OuterClass().new InnerClass().amIInner());
	}
//	
//	@Test
//	public void createInstanceOfInnerClassWithoutInstanceOfOuter() {
//		assertTrue(new OuterClass.InnerClass().amIInner());
//	}
	
	@Test
	public void shadowing() {
		String innerName = "Inner";
		String outerName = "Outer";
		OuterClass.InnerClass inner = new OuterClass(outerName).new InnerClass(innerName);

		assertSame(innerName, inner.getName());
		assertSame(outerName, inner.getOuterName());
	}
}
