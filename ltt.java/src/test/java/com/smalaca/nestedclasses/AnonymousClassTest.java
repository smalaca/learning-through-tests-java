package com.smalaca.nestedclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnonymousClassTest {

	@Test
	public void createWithInterface() {
		assertEquals("Hi, my name is ?", new WithAnonymousClass().getRealization());
	}
	
	@Test
	public void createWithClass() {
		String sebastian = "Sebastian";
		assertEquals("Hi, my name is " + sebastian, new WithAnonymousClass().getSubType(sebastian));
	}
	
	@Test
	public void withMembers() {
		assertEquals("Sebastian Malaca", new WithAnonymousClass().getFullName("Sebastian", "Malaca"));
	}
}
