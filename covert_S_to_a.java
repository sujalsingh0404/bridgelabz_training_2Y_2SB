package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class covert_S_to_a {
   public static void main(String[] args) {
      System.out.println("Enter the String :");
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      char[] c = a.toCharArray();
      System.out.println(Arrays.toString(c).makeConcatWithConstants<invokedynamic>(Arrays.toString(c)));
   }
}
