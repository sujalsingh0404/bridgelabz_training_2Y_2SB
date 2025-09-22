package com.demo;

import java.io.PrintStream;
import java.util.Scanner;

public class string_bound_exception {
   public static void generateException(String text) {
      PrintStream var10000 = System.out;
      int var10001 = text.length();
      var10000.println("Character at index " + var10001 + ": " + text.charAt(text.length()));
   }

   public static void handleException(String text) {
      try {
         PrintStream var10000 = System.out;
         int var10001 = text.length();
         var10000.println("Character at index " + var10001 + ": " + text.charAt(text.length()));
      } catch (StringIndexOutOfBoundsException var2) {
         System.out.println("Exception Caught: " + String.valueOf(var2));
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
