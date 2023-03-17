package com.bridgelabz.operatorprograms;

/*Enter two numbers and do the following arithmetic Operations find max and min.
  i) a+b*c ii) c+a/b
  iii) a%b+c iV) a*b+c */

import java.util.Scanner;

public class MinAndMaxValue {

	public static void main(String[] args) {
		
		float a,b,c;
		float arithmeticOperation1,arithmeticOperation2,arithmeticOperation3,arithmeticOperation4;
		
		//input  a,b,c from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c:");
		
		a=scanner.nextFloat();
		b=scanner.nextFloat();
		c=scanner.nextFloat();
		
		//calculate arithmetic operations
		arithmeticOperation1=a+(b*c);
		arithmeticOperation2=c+(a/b);
		arithmeticOperation3=(a%b)+c;
		arithmeticOperation4=(a*b)+c;
		
		//print the output of arithmetic operation
		System.out.println("a+b*c= " + arithmeticOperation1);
		System.out.println("c+a/b= " + arithmeticOperation2);
		System.out.println("a%b+c= " + arithmeticOperation3);
		System.out.println("a*b+c= " + arithmeticOperation4);
		
		//find maximum value
		if( (arithmeticOperation1 > arithmeticOperation2) && (arithmeticOperation1>arithmeticOperation3) && (arithmeticOperation1 > arithmeticOperation4)) {
			System.out.println(arithmeticOperation1 + " is maximum");
		}else if( (arithmeticOperation2 > arithmeticOperation1) && (arithmeticOperation2>arithmeticOperation3) && (arithmeticOperation2 > arithmeticOperation4)) {
			System.out.println(arithmeticOperation2 + " is maximum");
		}else if( (arithmeticOperation3 > arithmeticOperation1) && (arithmeticOperation3>arithmeticOperation2) && (arithmeticOperation3 > arithmeticOperation4)) {
			System.out.println(arithmeticOperation3 + " is maximum");
		}else {
			System.out.println(arithmeticOperation4 + " is maximum");
		}
		
		//find minimum value
		if( (arithmeticOperation1 < arithmeticOperation2) && (arithmeticOperation1 < arithmeticOperation3) && (arithmeticOperation1 < arithmeticOperation4)) {
			System.out.println(arithmeticOperation1 + " is minimum");
		}else if( (arithmeticOperation2 < arithmeticOperation1) && (arithmeticOperation2 < arithmeticOperation3) && (arithmeticOperation2 < arithmeticOperation4)) {
			System.out.println(arithmeticOperation2 + " is minimum");
		}else if( (arithmeticOperation3 < arithmeticOperation1) && (arithmeticOperation3 < arithmeticOperation2) && (arithmeticOperation3 < arithmeticOperation4)) {
			System.out.println(arithmeticOperation3 + " is minimum");
		}else {
			System.out.println(arithmeticOperation4 + " is minimum");
		}
		
	}

}
