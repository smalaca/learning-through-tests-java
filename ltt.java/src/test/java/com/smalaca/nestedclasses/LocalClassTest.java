package com.smalaca.nestedclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocalClassTest {

//	@Test
//	public void cannotDefineStaticMember() {
//		assertSame("static member", new WithLocalClass().getStaticMember());
//	}
	
//	@Test
//	public void cannotDeclareInterface() {
//		new WithLocalClass().withInterface();
//	}

	@Test
	public void canDefineStaticAndFinalMember() {
		assertSame("static and final", new WithLocalClass().getStaticFinalMember());
	}

}
