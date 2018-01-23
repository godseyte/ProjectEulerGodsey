/*
 * Written by Tucker Godsey
 * 11/30/2017
 * 
 * This class helps to solve problem 10 on ProjectEuler.net
 * This class is the PrimeNumbers class, which will give all prime numbers under the input amount to the main class, so it can solve the problem
 */
package problem010;

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
