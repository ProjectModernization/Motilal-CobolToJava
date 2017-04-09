/**
 * 
 */
package com.deloitte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author mdaravatu
 *
 */
public class PerformFormat1Test {

	@Test
	public void performTest() {
		
		PerformFormat1 perform = new PerformFormat1();
		perform.perform();
		assertEquals("perform", perform.message);
	}

}
