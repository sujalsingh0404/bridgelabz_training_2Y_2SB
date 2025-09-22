package com.demo;

import java.util.Scanner;

public class banking_system {
   public static void main(String[] abc) {
      Scanner sc;
      sc = new Scanner(System.in);
      double balance = 10000.0D;
      System.out.println("Banking System Menu");
      System.out.println("1. Check Balance");
      System.out.println("2. Transfer Funds");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      label14:
      switch(choice) {
      case 1:
         System.out.println("Your current balance is: ₹" + balance);
         break;
      case 2:
         System.out.println("\n--- Transfer Funds ---");
         System.out.println("1. Savings Account");
         System.out.println("2. Current Account");
         System.out.print("Choose account type: ");
         int subChoice = sc.nextInt();
         switch(subChoice) {
         case 1:
            System.out.println("Funds transferred to Savings Account ✅");
            break label14;
         case 2:
            System.out.println("Funds transferred to Current Account ✅");
            break label14;
         default:
            System.out.println("Invalid account type ❌");
            break label14;
         }
      case 3:
         System.out.println("Thank you for using our Banking System. \ud83d\udc4b");
         break;
      default:
         System.out.println("Invalid choice ❌");
      }

      sc.close();
   }
}
