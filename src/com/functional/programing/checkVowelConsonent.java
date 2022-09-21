package com.functional.programing;

import java.util.Scanner;

public class checkVowelConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character To See Vowel Or Consonent:~ ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case 'A': 
			System.out.println("A is Vowel");
			break;
		case 'E':
			System.out.println("E is Vowel");
			break;
		case 'I':
			System.out.println("I is Vowel");
			break;
		case 'O':
			System.out.println("O is Vowel");
			break;
		case 'U':
			System.out.println("U is Vowel");
			break;
		default :
			System.out.println("This is Consonent: ");
		}

	}

}
