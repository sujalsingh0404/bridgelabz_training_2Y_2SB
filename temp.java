package com.demo;

import java.util.Scanner;

public class temp {
   public static double digit(double a, double b) {
      double windchill = 35.74D + 0.6215D * a + (0.4275D * a - 35.75D) * b;
      return windchill;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Temperature: ");
      double a = input.nextDouble();
      System.out.print("Windchill: ");
      double b = input.nextDouble();
      double w = digit(a, b);
      System.out.printf("Windchill Temperature  " + w);
   }
}
