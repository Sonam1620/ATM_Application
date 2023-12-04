package ATMMACHINE;


import java.util.Scanner;

public class ATM {
    float balance;
    int PIN=5674;
     public void checkpin(){
         System.out.println("enter your pin");
         Scanner sc=new Scanner(System.in);
         int enteredpin=sc.nextInt();
         if(enteredpin==PIN)
         {
             menu();

         }
         else{
             System.out.println("enter a valid pin");

         }
         menu();
     }
      public void menu() {
          System.out.println("enter your choice:  ");
          System.out.println("1. check A/C balance");
          System.out.println("2. withdraw money");
          System.out.println("3. deposite money");
          System.out.println("4. exit");

          Scanner sc = new Scanner(System.in);
          int opt = sc.nextInt();

          if (opt == 1) {
              checkBalance();

          } else if (opt == 2) {
              withdrawMoney();

          } else if (opt == 3) {
              depositeMoney();
          } else if (opt == 4) {
              return;
          } else {
              System.out.println("enter a value choice");

          }
      }

          public void checkBalance(){
              System.out.println("balance: "+ balance);
              menu();
          }
          public void withdrawMoney() {
              System.out.println("enter amount to withdraw");
              Scanner sc = new Scanner(System.in);
              float amount = sc.nextFloat();
              if (amount > balance) {
                  System.out.println("indufficient balance");
              } else {
                  balance = balance - amount;
                  System.out.println("money withdraw successfull");
              }
              menu();
          }

          public void depositeMoney(){
         System.out.println("enter a amount: ");
         Scanner sc=new Scanner(System.in);
         float amount=sc.nextFloat();
         balance=balance+amount;
         System.out.println("money deposited successfully");
         menu();
     }
}


