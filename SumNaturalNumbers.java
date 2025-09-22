package com.demo;

import java.util.Scanner;

public class SumNaturalNumbers {
   public static int findSum(int n) {
      int sum = 0;

      for(int i = 1; i <= n; ++i) {
         sum += i;
      }

      return sum;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a positive integer n: ");
      int n = sc.nextInt();
      int result = findSum(n);
      System.out.println("The sum of first " + n + " natural numbers is: " + result);
      sc.close();
   }
}
