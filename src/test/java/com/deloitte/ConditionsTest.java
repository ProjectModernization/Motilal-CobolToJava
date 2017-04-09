/**
 * 
 */
package com.deloitte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.deloitte.dto.ConditionsDTO;

/**
 * @author mdaravatu
 *
 */
public class ConditionsTest {

	@Test
	public void validateInputTest() {
		System.out.println("Test Case - ConditionsTest");
		Conditions conditions = new Conditions();
		ConditionsDTO conditionsDTO = new ConditionsDTO();
		
		conditions.validateInput(conditionsDTO);
		assertEquals("a", conditionsDTO.getVowels());
		assertEquals("b", conditionsDTO.getConsonants());
		assertEquals(1, conditionsDTO.getDigits());
	}

}
