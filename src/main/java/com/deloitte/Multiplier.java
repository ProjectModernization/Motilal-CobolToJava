/**
 * 
 */
package com.deloitte;

import java.util.Scanner;

import com.deloitte.dto.MultiplierDTO;

/**
 * @author mdaravatu
 *
 */
public class Multiplier {
	
	public void multiply(MultiplierDTO multiplierDTO) {
		//MultiplierDTO multiplier = new MultiplierDTO();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number  (1 digit) : ");
		multiplierDTO.setNum1(scan.nextInt());
		System.out.print("Enter second number (1 digit) : ");
		multiplierDTO.setNum2(scan.nextInt());
		multiplierDTO.setResult(multiplierDTO.getNum1() * multiplierDTO.getNum2());
		System.out.print("Result is = " +multiplierDTO.getResult());
	}

}
