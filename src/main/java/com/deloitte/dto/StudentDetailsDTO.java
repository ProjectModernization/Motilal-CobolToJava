/**
 * 
 */
package com.deloitte.dto;


/**
 * @author mdaravatu
 *
 */
public class StudentDetailsDTO {
	private int id;
	private String surname;
	private String initials;
	private String courseCode;
	private String gender;
	private String currentDate;
	private int dayOfYear;
	private String currentTime;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the initials
	 */
	public String getInitials() {
		return initials;
	}
	/**
	 * @param initials the initials to set
	 */
	public void setInitials(String initials) {
		this.initials = initials;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	/**
	 * @return the currentDate
	 */
	public String getCurrentDate() {
		return currentDate;
	}
	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	/**
	 * @return the dayOfYear
	 */
	public int getDayOfYear() {
		return dayOfYear;
	}
	/**
	 * @param dayOfYear the dayOfYear to set
	 */
	public void setDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
	}
	/**
	 * @return the currentTime
	 */
	public String getCurrentTime() {
		return currentTime;
	}
	/**
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
}
