package com.deloitte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestProgramTest {

	@Test
	public void showMessageTest() {
		ShortestProgram shortestProgram = new ShortestProgram();
		shortestProgram.showMessage();
		assertEquals("I did it", shortestProgram.getMessage());	
	}

}
