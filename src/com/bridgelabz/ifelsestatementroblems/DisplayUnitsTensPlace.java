package com.bridgelabz.ifelsestatementroblems;

import java.util.Scanner;

/*Read a single Digit Number and write in word*/

public class DisplayUnitsTensPlace {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number between 1 to 999: ");
		
		int number = scanner.nextInt();
		
     	int units=number % 10;
		int tens=number / 10 % 10;
		int hundreds=number / 100 % 10;
		
		if(hundreds!=0) {
			System.out.println("Hundreds place=" +hundreds);
		}
		if(tens!=0) {
			System.out.println("Tens place=" +tens);
		}
		if(units!=0) {
			System.out.println("units place=" +units);
		}

	}

}
