package com.demo;

import java.util.Scanner;

public class IllegalArgumentDemo {
   public static void handleException(String text) {
      try {
         if (text.length() < 5) {
            throw new IllegalArgumentException("Text too short for substring");
         }

         System.out.println("Substring: " + text.substring(2, 5));
      } catch (IllegalArgumentException var2) {
         System.out.println("Caught IllegalArgumentException: " + String.valueOf(var2));
      } catch (RuntimeException var3) {
         System.out.println("Caught RuntimeException: " + String.valueOf(var3));
      }

   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String input = sc.nextLine();
      handleException(input);
      sc.close();
   }
}
