package RealTime;

import java.util.Scanner;

public class Atm extends loop.Find_palindrome_number
{
    public static void main(String[] args)
    {
       int balance =2000,w,d,pin=1234,e;
        Scanner p=new Scanner(System.in);
        System.out.println("*-Welcome To Virtual ATM-*");
        System.out.println("Enter Your ATM Pin.");
        e=p.nextInt();
        while(e!=pin)
        {
            System.out.println("Enter The Correct ATM Pin.");
            System.out.println("Enter Your ATM Pin.");
            e=p.nextInt();
        }
        System.out.println("Plese Select The Desisre Option ");
        while(true)
        {
            System.out.println("*-Press 1 For Withdrwal The Amount-*");
            System.out.println("*-Press 2 For Deposit The Amount-*");
            System.out.println("*-Press 3 For Check Balance Of Your Account-*");
            System.out.println("*-Press 4 For Exit");
          int o=p.nextInt();
          switch (o)
          {
              case 1:
                  System.out.println("Enter The Amount:-");
                  w=p.nextInt();
                  if (balance>=w)
                  {
                      balance=balance-w;
                      System.out.println("*-Kindly Collect Your Money-*");
                  }
                  else
                  {
                      System.out.println("*-Insufficient Balance-*\n");
                  }
                  break;
                  case 2:
                      System.out.println("Enter The Amount:-");
                      d=p.nextInt();
                      balance=balance+d;
                      System.out.println("*-Your Amount Is Credit To your Account -*"  +balance);
                      System.out.println(" ");
                      break;
              case 3:
                  System.out.println("Your Net Balance Is-"+balance);
                  System.out.println("");
                  break;
              case 4:
                  //exit from the menu
                  //System.out.println("*-Thankyou For Using Us-*");
                  System.exit(0);
          }
        }
    }
}
