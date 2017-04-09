/**
 * 
 */
package com.deloitte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.deloitte.dto.MultiplierDTO;

/**
 * @author mdaravatu
 *
 */
public class MultiplierTest {

	@Test
	public void multiplyTest() {
		System.out.println("TestCase 2 = MultiplierTest");
		Multiplier multiplier = new Multiplier();
		MultiplierDTO multiplierDTO = new MultiplierDTO();
		
		multiplier.multiply(multiplierDTO);
		assertEquals(2,multiplierDTO.getNum1());
		assertEquals(2, multiplierDTO.getNum2());
		assertEquals(4, multiplierDTO.getResult());
		
	}

}
