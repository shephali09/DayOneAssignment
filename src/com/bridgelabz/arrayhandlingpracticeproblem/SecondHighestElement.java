package com.bridgelabz.arrayhandlingpracticeproblem;

/*Find 2nd Largest Number in an Array*/

import java.util.Scanner;

public class SecondHighestElement {

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
			System.out.println(array[i] + " ");
		}
		
		int temp;
		for(int i=0;i<lengthOfArray;i++) {
			for(int j=i+1;j<lengthOfArray;j++) {
				if(array[i] > array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		System.out.println("Second highest element in array is: " +array[lengthOfArray-2] );
	}
}
