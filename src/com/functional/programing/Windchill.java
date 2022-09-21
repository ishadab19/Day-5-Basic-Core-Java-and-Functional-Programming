package com.functional.programing;

import java.util.*;

public class Windchill {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Temperature in Fahrenheit: ");
    double t = sc.nextDouble();
    System.out.println("Enter Wind Speed In miles Per Hour: ");
    double v = sc.nextDouble();
     if (Math.abs(t) > 50 || v > 120 || v < 3) {
     	System.out.println("enter correct input");
     }
     else {
    	 System.out.println(" ");
    	 double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
 		System.out.println("Wind Chill : "+ w);
      
     }
    
     
     
     
     
     
     
     
     
    	 
     }
}
