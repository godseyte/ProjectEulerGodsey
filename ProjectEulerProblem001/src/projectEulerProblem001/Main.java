package projectEulerProblem001;

public class Main {

	public static void main(String[] args) {
		// Declare and Instantiate an object of type ProjectEuler001, and an integer. Call the solve method and receive the return value. Print solution to the console.
		
		// Creating variable "answer" that calls on the ProjectEulerProblem001 class
		ProjectEulerProblem001 solution = new ProjectEulerProblem001();
		
		// Creating the final answer variable
		int answer;
		
		// Setting the final answer
		answer = solution.solve();
		
		// Printing the answer
		System.out.println("The answer to Project Euler Problem #1 is: " + answer);
		
		// Check if answer is prime
		boolean prime = true; // Holds true/false variable for if the answer is prime
		
		for (int i = 2; i < answer; i++) { // If the answer is divisible by any number, prime will equal false, meaning the number isn't prime
			if (answer % i == 0) {
				prime = false;
			}
		}
		
		// Printing the boolean
		if (prime == true) {
			System.out.println("The answer is a prime number.");
		}
		else {
			System.out.println("The answer is not a prime number.");
		}
		
	}
}