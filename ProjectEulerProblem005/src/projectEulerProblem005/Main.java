/*
 * This class calls on the class that solves Project Euler Problem 005
 * https://projecteuler.net/problem=5
 * "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
 * Name: Tucker Godsey
 * Date: 11/16/17
 */

package projectEulerProblem005;

public class Main {

	public static void main(String[] args) {
		// Create a variable that will store the answer from the other class
		long probAns;
		
		// Call on the other class and set probAns to the answer found in the other class
		probAns = ProjectEulerProblem005.answer();
		
		// Print the solution
		System.out.println("The answer to Project Euler Problem 5 is: " + probAns);
	}

}
