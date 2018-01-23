/*
 * This class solves Project Euler Problem 001
 * https://projecteuler.net/problem=1
 * "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000."
 * Name: Tucker Godsey
 * Date: 11/14/17
 */

package projectEulerProblem001;

import java.util.ArrayList;

public class ProjectEulerProblem001 {
	public int solve() {
		// Solve the problem and return the answer
		
		// Creating ArrayList and dummy integer
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		int dummy = 0; // Dummy integer that temporarily holds information
		
		for (dummy = 0; dummy < 1000; dummy++) { // If the number is less than 1000 and a multiple of 3 or 5, add it to the array
			if (dummy % 3 == 0 || dummy % 5 == 0) {
				multiples.add(dummy);
			}
		}
		
		dummy = 0; // Clear the dummy variable so it can store the total sum
		
		for (int i = 0; i < multiples.size(); i++) {
			dummy += multiples.get(i);
		}
		
		return dummy; // Returns the sum of the multiples
	}
}
