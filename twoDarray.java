package com.demo;

import java.util.Scanner;

public class twoDarray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] matrix = new int[2][3];

      int i;
      int j;
      for(i = 0; i < 2; ++i) {
         for(j = 0; j < 3; ++j) {
            System.out.print("Enter element at [" + i + "][" + j + "]: ");
            matrix[i][j] = sc.nextInt();
         }
      }

      System.out.println("Matrix elements:");

      for(i = 0; i < 2; ++i) {
         for(j = 0; j < 3; ++j) {
            System.out.print(matrix[i][j] + " ");
         }

         System.out.println();
      }

   }
}
