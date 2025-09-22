package com.demo;

public class hello {
   public static void main(String[] abc) {
      int math_1 = true;
      int physics_1 = true;
      int chemistry_1 = true;
      int biology_1 = true;
      int computer_ = true;
      int math_2 = true;
      int physics_2 = true;
      int chemistry_2 = true;
      int biology_2 = true;
      int computer_2 = true;

      for(int i = 1; i <= 10; ++i) {
         if (i % 2 == 0 || i % 3 == 0) {
            System.out.println(i);
         }
      }

   }
}
