/**
 * 
 */
package com.deloitte;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mdaravatu
 *
 */
public class AssignmentMainTest {

	@Test
	public void assignmentMainTest() {
		AcceptAndDisplayTest accept = new AcceptAndDisplayTest();
		accept.showStudentDataTest();
		
		ConditionsTest conditions = new ConditionsTest();
		conditions.validateInputTest();
		
		IterationIfTest iteration = new IterationIfTest();
		iteration.calculateTest();
		
		MultiplierTest multiplier = new MultiplierTest();
		multiplier.multiplyTest();
		
		PerformFormat1Test perform = new PerformFormat1Test();
		perform.performTest();
		
		ShortestProgramTest shortest = new ShortestProgramTest();
		shortest.showMessageTest();
	}

}
