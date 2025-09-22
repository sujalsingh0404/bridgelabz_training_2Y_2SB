package com.demo;

import java.util.Scanner;

public class electricity_bill {
   public static void main(String[] abc) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if (a <= 100) {
         System.out.println(10 * a);
      } else {
         int d;
         int bi;
         if (a >= 100 && a <= 200) {
            d = a - 100;
            bi = 1000 + d * 15;
            System.out.print("Total Bill: " + bi);
         } else {
            d = a - 200;
            bi = 2500 + d * 20;
            System.out.print("Total Bill: " + bi);
         }
      }

   }
}
