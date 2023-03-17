package com.bridgelabz.operatorprograms;

public class SpringSeason {

	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		int date = Integer.parseInt(args[1]);
		
		if((month==3 && date>=20) || (month>3 && month<6) || (month==6 && date<=20)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
