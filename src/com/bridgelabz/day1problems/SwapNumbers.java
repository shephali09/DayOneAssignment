package com.bridgelabz.day1problems;

/* Write a program to 
  Swap two numbers */

public class SwapNumbers {

	public static void main(String[] args) {
		
		//Variables are declared.
		int numberOne=150, numberTwo=250,temp;
		
		//print the values before swapping of numbers
		System.out.println("Before swapping: "+numberOne + " and " +numberTwo);
		
		//swap the numbers
		temp=numberOne;
		numberOne=numberTwo;
		numberTwo=temp;
		
		//print the values after swapping of numbers
		System.out.println("After swapping: "+numberOne + " and " +numberTwo);
	}
}
