package com.bridgelabz.programswithwhileloop;
/*Program to reverse the integer number 
 eg. Input n=231 reverse is 132 */

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverseNumber=0, remainder;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		number = scanner.nextInt();
		
		while(number!=0) {
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number/10;
		}
		System.out.println("The reverse number is: " +reverseNumber);

	}

}
