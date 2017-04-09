/**
 * 
 */
package com.deloitte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.deloitte.dto.StudentDetailsDTO;

/**
 * @author mdaravatu
 *
 */
public class AcceptAndDisplayTest {

	@Test
	public void showStudentDataTest() {
		System.out.println("Test Case - AcceptAndDisplayTest");
		AcceptAndDisplay accept = new AcceptAndDisplay();
		StudentDetailsDTO studentDTO = new StudentDetailsDTO();
		
		accept.displayStudentData(studentDTO);
		
		assertEquals(527, studentDTO.getId());
		assertEquals("daravatu",studentDTO.getSurname());
		assertEquals("dml", studentDTO.getInitials());
		assertEquals("CSE", studentDTO.getCourseCode());
		assertEquals("M", studentDTO.getGender());
		
		assertEquals("2017 04 09", studentDTO.getCurrentDate());
		assertEquals(99, studentDTO.getDayOfYear());
		assertEquals("15:14", studentDTO.getCurrentTime());
		
	}

}
