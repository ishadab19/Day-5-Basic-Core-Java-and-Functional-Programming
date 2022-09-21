package com.functional.programing;

import java.math.MathContext;
import java.util.Scanner;

public class FlipCoinPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times you want to FLIP the COIN*");

		int n = sc.nextInt();
		
		int head = 0;
		int tail = 0;
		for(int i = 0; i<0 ; i++);{
			if(Math.random()<0.5) {
				head++;
			}
			else {
				tail++;
		}
		
			
		}
		int hper = (head*100)/n;
		int tper = (tail*100)/n;
		System.out.println("Head Percentage => "+hper+"%");
		System.out.println("Tail Percentage => "+tper+"%");
		System.out.println("HEADS => "+head);
		System.out.println("TAILS => "+tail);
	}

}
