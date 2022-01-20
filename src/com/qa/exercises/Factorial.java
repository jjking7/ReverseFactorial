package com.qa.exercises;

public class Factorial {

	public static double factrev(double fact) {
		double reverse = fact;
		for (int i = 2; reverse >= i; i++) {

			reverse /= i;
			if (reverse == 1) {
				System.out.println("Reverse Factorial of " + fact + " is: " + i + "!");
				return (int) i;
			}
		}

		System.out.println("" + fact + " is not a factorial");
		return 0;
	}

}
