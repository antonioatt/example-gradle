package org.jacoco.examples.java.gradle;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}
	
	@Test
	@Ignore("Ignored for simulate code coverage <100% - Remove ignore to increase code coverage")
	public void testGetMessageBigger() {
		assertEquals("Hello Universe!", subject.getMessage(true));
	}
}
