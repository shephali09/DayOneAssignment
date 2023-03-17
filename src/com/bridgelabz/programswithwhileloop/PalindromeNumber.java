package com.bridgelabz.programswithwhileloop;

/*Program to find Number is palindrome or not.
  eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
  eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.*/

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number,temp=0,sum=0,remainder;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		number=scanner.nextInt();
		
		temp=number;
		while(number>0) {
			remainder=number%10;
			sum=(sum*10)+remainder;
			number=number/10;
	}
		if(temp==sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
   }
}
