package com.functional.programing;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check:~ ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("This is an Even Number:~ "+num);
		}
		else {
			System.out.println("This is an Odd Number:~ "+num);
		}

	}

}
