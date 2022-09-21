package com.functional.programing;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a ");
		int a = sc.nextInt();
		System.out.println("enter value for b");
		int b = sc.nextInt();
		System.out.println("enter value for c");
		int c = sc.nextInt();
		
		
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);

		System.out.println("Roots of the given equations are :");
		System.out.println(x1);
		System.out.println(x2);

	}

}
