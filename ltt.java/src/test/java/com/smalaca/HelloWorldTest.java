package com.smalaca;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals("Let's start like always", new HelloWorld().present());
	}
}
