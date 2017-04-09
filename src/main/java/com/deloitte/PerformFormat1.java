/**
 * 
 */
package com.deloitte;

/**
 * @author mdaravatu
 *
 */
public class PerformFormat1 {
	
	String message = "perform";
	
	public void perform() {
		topLevel();
		
	
	}
	
	private static void topLevel() {
		System.out.println("In TopLevel. Starting to run program");
		oneLevelDown();
		System.out.println("Back in TopLevel.");
	}

	private static void oneLevelDown() {
		System.out.println(">>>> Now in OneLevelDown");
		twoLevelDown();
		System.out.println(">>>> Back in OneLevelDown");
	}

	private static void twoLevelDown() {
		System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		threeLevelDown();
		System.out.println(">>>>>>>> Back in TwoLevelsDown.");
	}

	private static void threeLevelDown() {
		System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");
	}

}
