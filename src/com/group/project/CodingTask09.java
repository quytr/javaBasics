package com.group.project;

public class CodingTask09 {

	public static void main(String[] args) {

		/*
		 * Write a java program to find the second largest number in the array?
		 * 
		 */

		int[] numbs = { -40, 10, -17, 0, -85 };

		int size = numbs.length; // 4

		int largestNum = Integer.MIN_VALUE;

		int secLargest = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {

			if (numbs[i] > largestNum) {

				secLargest = largestNum;

				largestNum = numbs[i];
			}

			if (numbs[i] < largestNum && numbs[i] > secLargest) {

				secLargest = numbs[i];

			}

		}

		System.out.println("The largest number is " + largestNum);

		System.out.println("The second largest number is " + secLargest);

	}
}
