package com.bridgelabz.arrayhandlingpracticeproblem;
 
/*Java Program to print the largest element in an array*/

import java.util.Scanner;

public class LargestElement {
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
		int max = array[0];
		for(int i=0;i<lengthOfArray;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The Largest element in array is: " +max);
	}

}

