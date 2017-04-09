/**
 * 
 */
package com.deloitte;

import java.util.Scanner;

import com.deloitte.dto.IterationIfDTO;

/**
 * @author mdaravatu
 *
 */
public class IterationIf {

	public IterationIf() {
	}

	/**
	 * 
	 * @param dto
	 * @return
	 */
	public int calculate(IterationIfDTO dto) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i <= 1; i++) {
			System.out.print("Enter First Number: ");
			dto.setNum1(scan.nextInt());
			System.out.print("Enter Second Number: ");
			dto.setNum2(scan.nextInt());
			System.out.print("Enter Operator (+ or *): ");
			dto.setOperator(scan.next());
			
			if (dto.getOperator().equals("+")) {
				dto.setResult(dto.getNum1() + dto.getNum2());
			} else if (dto.getOperator().equals("*")) {
				dto.setResult(dto.getNum1() * dto.getNum2());
			} else {
				System.out.println("Invalid operator");
				return dto.getResult();
			}
			System.out.println("Result = " + dto.getResult());
		}

		return dto.getResult();
	}
}
