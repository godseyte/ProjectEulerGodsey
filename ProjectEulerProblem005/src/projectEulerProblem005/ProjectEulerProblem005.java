/*
 * This class solves Project Euler Problem 005
 * https://projecteuler.net/problem=5
 * "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
 * Name: Tucker Godsey
 * Due Date: 11/16/17
 */
package projectEulerProblem005;

public class ProjectEulerProblem005 {
	// Create the solution that the main will call on
	public static long answer() {
		// Create a variable to hold which number is currently being tested
		long curNum = 20; // Set to 2, because it is the largest number that will be tested
		
		// Create a boolean that states if the solution was found
		boolean isAns = false;
		
		// Create a loop that does the problem
		while (true) { // Loop until broken
			for (int i = 1; i <= 20; i++) {
				if (curNum % i == 0) {
					isAns = true; // If the number has no remainder, keep going until it hits 20. Otherwise, stop and set to false
				} else {
					isAns = false;
					break;
				}
			}
			// If answer still equals true, break the loop. Otherwise, add 20 to the current number and try again
			if (isAns == true) {
				break;
			} else {
				curNum += 20;
			}
		}
		return curNum;
		
	}
	
}
