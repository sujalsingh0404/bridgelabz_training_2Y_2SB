package com.demo;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Level_one_assignment {
   public static char[] getChars(String str) {
      char[] chars = new char[str.length()];

      for(int i = 0; i < str.length(); ++i) {
         chars[i] = str.charAt(i);
      }

      return chars;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String text = sc.nextLine();
      char[] charsCustom = getChars(text);
      char[] charsBuiltIn = text.toCharArray();
      System.out.println("User-defined method: " + Arrays.toString(charsCustom));
      System.out.println("Built-in toCharArray(): " + Arrays.toString(charsBuiltIn));
      PrintStream var10000 = System.out;
      boolean var10001 = Arrays.equals(charsCustom, charsBuiltIn);
      var10000.println("Are both arrays equal? " + var10001);
      sc.close();
   }
}
