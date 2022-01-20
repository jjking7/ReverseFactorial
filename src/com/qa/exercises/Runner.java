package com.qa.exercises;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int fact = scan.nextInt();
		scan.close();
		System.out.println(Factorial.factrev(fact));
}
	
}
