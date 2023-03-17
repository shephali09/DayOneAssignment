package com.bridgelabz.arrayhandlingpracticeproblem;

/*Java Program to print the duplicate elements of an array*/

import java.util.Scanner;

public class DuplicateElements {

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
		
		System.out.println("Duplicate elements in array: ");
		for(int i=0; i<lengthOfArray;i++) {
			for(int j=i+1;j<lengthOfArray;j++) {
				if( array[i] == array[j] ) 
					System.out.println(array[j]);
				
			}
		}

	}

}

