/**
 * 
 */
package com.deloitte.dto;

/**
 * @author mdaravatu
 *
 */
public class ConditionsDTO {

	String vowels ="aeiou";
	String consonants = "bcdfghjklmnpqrstvwxyz";
	String digits = "0123456789";
	
	
	/**
	 * @return the vowels
	 */
	public String getVowels() {
		return vowels;
	}
	/**
	 * @param vowels the vowels to set
	 */
	public void setVowels(String vowels) {
		this.vowels = vowels;
	}
	/**
	 * @return the consonants
	 */
	public String getConsonants() {
		return consonants;
	}
	/**
	 * @param consonants the consonants to set
	 */
	public void setConsonants(String consonants) {
		this.consonants = consonants;
	}
	/**
	 * @return the digits
	 */
	public String getDigits() {
		return digits;
	}
	/**
	 * @param digits the digits to set
	 */
	public void setDigits(String digits) {
		this.digits = digits;
	}
	
	

}
