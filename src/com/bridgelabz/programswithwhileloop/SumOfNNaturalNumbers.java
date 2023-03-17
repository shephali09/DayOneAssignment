package com.bridgelabz.programswithwhileloop;

/* Write a Program for the sum of n natural numbers 
eg. Input N=5 output 1+2+3+4+5*/

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	
	public static void main(String[] args) {
		int number ,sum=0,i=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number  : ");
		
		number = scanner.nextInt();
		
		while(i<=number) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of first "+ number + " numbers: " + sum);
	}

}
