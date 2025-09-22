package com.demo;

import java.util.Scanner;

public class oneDarray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] numbers = new int[4];

      int num;
      for(num = 0; num < numbers.length; ++num) {
         System.out.print("Enter number " + (num + 1) + ": ");
         numbers[num] = sc.nextInt();
      }

      System.out.println("Elements in the array:");
      int[] var6 = numbers;
      int var5 = numbers.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         num = var6[var4];
         System.out.println(num);
      }

   }
}
