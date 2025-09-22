package com.demo;

import java.util.Scanner;

public class vowel_consonant {
   public static void main(String[] abc) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a character: ");
      char ch = sc.next().charAt(0);
      switch(ch) {
      case 'a':
         System.out.println(" It is a Vowel.");
         break;
      case 'e':
         System.out.println("It is a Vowel.");
         break;
      case 'i':
         System.out.println("It is a Vowel.");
         break;
      case 'o':
         System.out.println("It is a Vowel.");
         break;
      case 'u':
         System.out.println("It is a Vowel.");
         break;
      default:
         if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Consonant.");
         } else {
            System.out.println("It is not Alphabate");
         }
      }

   }
}
