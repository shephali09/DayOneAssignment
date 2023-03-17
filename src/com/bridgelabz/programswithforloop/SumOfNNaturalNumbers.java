package com.bridgelabz.programswithforloop;

/* Write a Program for the sum of n natural numbers 
eg. Input N=5 output 1+2+3+4+5*/

import java.util.Scanner;

public class SumOfNNaturalNumbers {

		public static void main(String[] args) {
			int number ,sum=0,i;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number: ");
			
			number = scanner.nextInt();
			
			for(i=1;i<=number;i++) {
				sum=sum+i;
			}
			System.out.println("Sum of first "+ number + " numbers: " + sum);
		}

	}


