package com.replit.hw;

import java.util.Scanner;

public class ScannerClass023 {

	public static void main(String[] args) {
		/*
		 * Create a program that will ask a user to input boolean value
		 * "Input the boolean value"
		 * 
		 * If the input is true or false, then the output should look like below:
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the boolean value");

		boolean answer = sc.nextBoolean();

		System.out.println("The value is " + answer);

	}

}
