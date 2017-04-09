/**
 * 
 */
package com.deloitte;

import java.util.Scanner;

import com.deloitte.dto.ConditionsDTO;

/**
 * @author mdaravatu
 *
 */
public class Conditions {

	public void validateInput(ConditionsDTO conditionsDTO) {

		Scanner scan;
		char ch;
		String input;
		
		do {
			System.out.print("Enter lower case character or digit: ");
			scan = new Scanner(System.in);
			
			input = scan.next();
			ch = input.charAt(0);
			
			if(conditionsDTO.getVowels().contains(input))
				System.out.println("The Char "+input+" is a vowel.");
			else if(conditionsDTO.getConsonants().contains(input))
				System.out.println("The Char "+input+" is a consonant.");
			else if(conditionsDTO.getDigits().contains(input))
				System.out.println("The Char "+input+" is a digit.");
			else 
				System.out.println("problems found");
		} while(!Character.isLetterOrDigit(ch));
	}

}
