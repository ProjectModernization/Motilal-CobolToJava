/**
 * 
 */
package com.deloitte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.deloitte.dto.IterationIfDTO;

/**
 * @author mdaravatu
 *
 */
public class IterationIfTest {
	

	@Test
	public void calculateTest() {
		System.out.println("Test Suite is beginning...");
		IterationIfDTO dto = new IterationIfDTO();
		IterationIf iter = new IterationIf();
		
		iter.calculate(dto);
		assertEquals(2,dto.getNum1());
		assertEquals(2, dto.getNum2());
		if(dto.getOperator() == "+") {
			assertEquals("+", dto.getOperator());
			assertEquals(4, dto.getResult());
		}
		else if(dto.getOperator() == "*") {
			assertEquals("*", dto.getOperator());
			assertEquals(4, dto.getResult());
		}
	}

}
