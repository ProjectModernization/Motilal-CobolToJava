/**
 * 
 */
package com.deloitte;

import com.deloitte.dto.ConditionsDTO;
import com.deloitte.dto.IterationIfDTO;
import com.deloitte.dto.MultiplierDTO;
import com.deloitte.dto.StudentDetailsDTO;

/**
 * @author mdaravatu
 *
 */
public class AssignmentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conditions conditions = new Conditions();
		ConditionsDTO conditionsDTO = new ConditionsDTO();
		conditions.validateInput(conditionsDTO);
		
		IterationIf iteration = new IterationIf();
		IterationIfDTO iterationDTO = new IterationIfDTO();
		iteration.calculate(iterationDTO);
		
		Multiplier multiplier = new Multiplier();
		MultiplierDTO multiplierDTO = new MultiplierDTO();
		multiplier.multiply(multiplierDTO);
		
		PerformFormat1 perform = new PerformFormat1();
		perform.perform();
		
		ShortestProgram shortest = new ShortestProgram();
		shortest.showMessage();
		
		AcceptAndDisplay accept = new AcceptAndDisplay();
		StudentDetailsDTO sutdentDTO = new StudentDetailsDTO();
		accept.displayStudentData(sutdentDTO);
		
	}

}
