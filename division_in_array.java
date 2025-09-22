package com.demo;

import java.util.Scanner;

public class division_in_array {
   public static void main(String[] abc) {
      new Scanner(System.in);
      int[] numbers = new int[]{5, 6, 9, 12, 15, 17, 20};
      int[] var6 = numbers;
      int var5 = numbers.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         int num = var6[var4];
         if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + " it is divisible by both 2 and 3");
         } else if (num % 2 == 0) {
            System.out.println(num + " it is divisible by 2");
         } else if (num % 3 == 0) {
            System.out.println(num + " it is divisible by 3");
         } else {
            System.out.println(num + " it is not divisible by 2 or 3");
         }
      }

   }
}
