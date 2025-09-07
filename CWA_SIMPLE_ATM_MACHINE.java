package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_SIMPLE_ATM_MACHINE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance : ");
        int balance = sc.nextInt();
        int ch;
        do {
            System.out.println("\n 1.check Balance \n 2.Deposit\n 3.Withdraw\n 4.exit : ");
            System.out.println("Enter the choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("The total balance is : " + balance);
                    break;
                case 2:
                    System.out.println("Enter deposit balance : ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    break;
                case 3:
                    System.out.println("Enter the amount for withdraw : ");
                    int w = sc.nextInt();
                    if (w <= balance) {
                        balance -= w;
                    } else {
                        System.out.println("Not enough balance ! sorry ☺ ");
                    }
                    break;
                case 4:
                    System.out.println("Exit  ! ");
                    break;
                default:
                    System.out.println("Invalid choice ! please try again : ");
            }
        } while (ch != 4);
    }
}
