/**
 * 
 */
package com.deloitte;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.deloitte.dto.StudentDetailsDTO;

/**
 * @author mdaravatu
 *
 */
public class AcceptAndDisplay {
	
	public void displayStudentData(StudentDetailsDTO studentDTO) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student details using template below");
		System.out.println("Enter - ID,Surname,Initials,CourseCode,Gender");
		System.out.println("SSSSSSSNNNNNNNNIICCCCG");
		studentDTO.setId(scan.nextInt());
		studentDTO.setSurname(scan.next());
		studentDTO.setInitials(scan.next());
		studentDTO.setCourseCode(scan.next());
		studentDTO.setGender(scan.next());
		
		Calendar cal = Calendar.getInstance();
		
		studentDTO.setDayOfYear(cal.get(Calendar.DAY_OF_YEAR));
		studentDTO.setCurrentDate(new SimpleDateFormat("yyyy MM dd").format(new Date()));
		studentDTO.setCurrentTime(new SimpleDateFormat("HH").format(new Date())+":"+ new SimpleDateFormat("mm").format(new Date()));
		
		System.out.println("Name is "+studentDTO.getInitials()+" "+studentDTO.getSurname());
		System.out.println("Date is "+studentDTO.getCurrentDate());
		System.out.println("Today is day "+studentDTO.getDayOfYear()+"  of the year");
		System.out.println("The time is "+studentDTO.getCurrentTime());
	}

}
