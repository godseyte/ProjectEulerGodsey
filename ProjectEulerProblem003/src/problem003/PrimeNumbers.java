/*
 * This class solves Project Euler Problem 003 and reports back to the Main class
 * https://projecteuler.net/problem=3
 * "What is the largest prime factor of the number 600851475143 ?"
 * Name: Tucker Godsey
 * Date: 1/9/2018
 */

package problem003;

public class PrimeNumbers {
	// Check to see if an integer is prime, and return true or false. True if prime, false if not prime.
			public static boolean isPrime(long number) {
				boolean result = true;
				// Test if number is prime
				if (number == 1) { // 1 is not prime and isn't checked
					result = false; 
				}
				if (number % 2 == 0) { // Even numbers are not prime
					result = false;
				}
				if (number == 2) { // 2 is prime and isn't checked
					result = true;
				}
				for (int i = 3; i < number / 2; i += 2) {
					if (number % i == 0) {
						result = false;
						break;
					}
				}
				// Return the result
				return result;
			}
}
