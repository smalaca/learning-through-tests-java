package com.smalaca.nestedclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocalClassAttributAccessTest {

	@Test
	public void createInstanceOfLocalClass() {
		assertTrue(new WithLocalClass().isLocalClassAlive());
	}
	
	@Test
	public void accessToStaticEnclosingClassAtribute() {
		assertSame("static", new WithLocalClass().getStatic());
	}
	
	@Test
	public void accessToRegularEnclosingClassAtribute() {
		assertSame("regular", new WithLocalClass().getRegular());
	}
	
	@Test
	public void accessToFinalEnclosingClassAtribute() {
		assertSame("final", new WithLocalClass().getFinal());
	}
	
//	@Test
//	public void accessToRegularMethodVariable() {
//		assertSame("regular var", new WithLocalClass().getRegularVar());
//	}
	
	@Test
	public void accessToFinalMethodVariable() {
		assertSame("final var", new WithLocalClass().getFinalVar());
	}
}
