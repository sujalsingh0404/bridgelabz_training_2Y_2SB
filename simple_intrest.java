package com.demo;

import java.util.Scanner;

public class simple_intrest {
   public static double calculateSimpleInterest(double principal, double rate, double time) {
      return principal * rate * time / 100.0D;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Principal amount: ");
      double principal = sc.nextDouble();
      System.out.print("Enter the Rate of Interest: ");
      double rate = sc.nextDouble();
      System.out.print("Enter the Time (in years): ");
      double time = sc.nextDouble();
      double si = calculateSimpleInterest(principal, rate, time);
      System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
      sc.close();
   }
}
