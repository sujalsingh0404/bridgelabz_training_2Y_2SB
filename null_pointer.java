package com.demo;

public class null_pointer {
   public static void main(String[] args) {
      Object text = null;

      try {
         int length = ((String)text).length();
         System.out.println("length" + length);
      } catch (NullPointerException var3) {
         System.out.println(var3);
      }

   }
}
