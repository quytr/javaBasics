package com.replit.hw;

import java.util.Scanner;

public class Arrays076 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates a String array with size 7.
		 * 
		 * Ask the user to input Days of a week beginning with Sunday using Scanner
		 * class.
		 * 
		 * Add these inputs to your array and then print all values from that array
		 */

		Scanner sc = new Scanner(System.in);
		
		String[] days = new String[7];
		
		for(int i =0; i < days.length; i++) {
			
			System.out.println("Please enter day " + (i+1) + " of the week");
			
			days[i] = sc.nextLine();
			
		}
		
		for(String day: days) {
			
			System.out.println(day);
		}
		
		

	}

}
