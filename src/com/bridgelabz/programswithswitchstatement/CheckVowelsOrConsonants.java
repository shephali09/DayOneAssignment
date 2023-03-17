package com.bridgelabz.programswithswitchstatement;

import java.util.Scanner;

/*Program to Check Vowel or Consonant*/

public class CheckVowelsOrConsonants {

	public static void main(String[] args) {
		char character;
		
		//Input an alphabet from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter character: ");
		character=(scanner.nextLine()).charAt(0);
		
		//Switch value of character
		switch(character){
		case 'a':
			System.out.println(character + " is Vowel");
			break;
		case 'e':
			System.out.println(character + " is Vowel");
		    break;
		case 'i':
			System.out.println(character + " is Vowel");
		    break;
		case 'o':
			System.out.println(character + " is Vowel");
		    break;
		case 'u':
			System.out.println(character + " is Vowel");
		    break;
		case 'A':
			System.out.println(character + " is Vowel");
		    break;
		case 'E':
			System.out.println(character + " is Vowel");
		    break;
		case 'I':
			System.out.println(character + " is Vowel");
		    break;
		case 'O':
			System.out.println(character + " is Vowel");
		    break;
		case 'U':
			System.out.println(character + " is Vowel");
		    break;
		default:
			System.out.println(character + " is Consonant");
		   
		}
	}
}
