package com.syntax.class13;

public class MethodsHW1 {
	
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	int largerNumb (int numb1, int numb2) {
		if (numb1 > numb2) {
			return numb1;
		}else if(numb2 > numb1) {
			return numb2;
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
		
		MethodsHW1 obj = new MethodsHW1();
		
		System.out.println("The larger number is " + obj.largerNumb(8, 90));
		System.out.println("The larger number is " + obj.largerNumb(50, 10));

	}

}
