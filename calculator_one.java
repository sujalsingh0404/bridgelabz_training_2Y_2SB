package com.demo;

import java.util.Scanner;

public class calculator_one {
   public static void main(String[] arg) {
      Scanner sc = new Scanner(System.in);
      System.out.print("1st number: ");
      int a = sc.nextInt();
      System.out.print("2nd number: ");
      int b = sc.nextInt();
      System.out.println(" Operations ");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplation");
      System.out.println("4. Devision");
      System.out.println("5. Remaining Rementor");
      int op = sc.nextInt();
      switch(op) {
      case 1:
         System.out.println("output:" + (a + b));
         break;
      case 2:
         System.out.println("output: " + (a - b));
         break;
      case 3:
         System.out.println("output:" + a * b);
         break;
      case 4:
         System.out.println("output: " + a / b);
         break;
      case 5:
         System.out.println("output: " + a % b);
         break;
      default:
         System.out.println("invalid operation: ");
      }

   }
}
