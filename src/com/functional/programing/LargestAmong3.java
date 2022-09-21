package com.functional.programing;

import java.util.Scanner;

public class LargestAmong3 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number: ");
		System.out.println("Enter 1st Number: ");
	    a = sc.nextInt();
		System.out.println("Enter 2nd Number; ");
		b = sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("1st Number is Largest");
		else if(b>a && b>c)
			System.out.println("2nd Number is Largest ");
		else if (c>a && c>b)
			System.out.println("3rd Number is Largest");
		else
			System.out.println("The Number are not distinct");
	}

}
