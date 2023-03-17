package com.bridgelabz.arrayhandlingpracticeproblem;

import java.util.Scanner;

/*Java Program to print the elements of an array in reverse order*/

public class ReverseOrder {

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
		
		System.out.println("Array elements in reverse order: " );
		for(int i=lengthOfArray-1;i>=0;i--) {
			System.out.print(array[i]+ " ");
		}

	}

}

