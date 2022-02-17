package com.homepractices;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Please enter two strings:");
		    String word1 = sc.nextLine();
		    String word2 = sc.nextLine();

		    System.out.println("Please enter two numbers:");
		    int num1 = sc.nextInt();
		    int num2 = sc.nextInt();

		    if(num1 == num2 && word1.equals(word2)){
		      System.out.println("AND");

		    }else if(num1 == num2 || word1.equals(word2)){
		      System.out.println("OR");

		    }else if(num1 != num2 && word1 != word2){
		      System.out.println("NONE");
		    }

	}

}
