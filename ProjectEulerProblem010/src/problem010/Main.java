/*
 * Written by Tucker Godsey
 * 11/30/2017
 * 
 * This class helps to solve problem 10 on ProjectEuler.net
 * This class is the main class, which will pull the numbers from the PrimeNumbers class, add them together, and print the answer
 */
package problem010;

public class Main {

	public static void main(String[] args) {
		// Create the integer for 2 million
		long base = 2000000;
		// Create the integer that stores the answer
		long answer = 0;
		// Create a boolean that says if a number is prime or not
		boolean prime;
		
		// Create a loop that calls on the PrimeNumbers class to check if a number is prime, and add it to the list
		for (long i = 1; i < base; i++) {
			prime = PrimeNumbers.isPrime(i);
			if (prime == true) {
				answer += i;
			}
		}
		
		// Print the answer
		System.out.println("The answer to problem 10 on ProjectEuler.net is: " + answer);
	}

}
