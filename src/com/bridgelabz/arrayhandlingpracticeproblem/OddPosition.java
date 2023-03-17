package com.bridgelabz.arrayhandlingpracticeproblem;

/*Java Program to print the elements of an array present on odd position*/

import java.util.Scanner;

public class OddPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array:");
		
		int lengthOfArray = sc.nextInt();
		int array[] = new int[lengthOfArray];
		
		System.out.println("Please enter array elements: ");
		for(int i=0;i<lengthOfArray;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<lengthOfArray;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Array elements at odd position: ");
		for(int i=1;i<lengthOfArray;i=i+2) {
			System.out.println(array[i]);
		}

	}
}

