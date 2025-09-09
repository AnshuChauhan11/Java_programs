package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_SIMPLE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        double num1 = 0,num2=0,result=0;
        do {
            System.out.println("----------Simple--Calculator---------");
            System.out.println("1.Addition ");
            System.out.println("2.Substraction ");
            System.out.println("3.Multiplication ");
            System.out.println("4.Division ");
            System.out.println("5.Modulus ");
            System.out.println("6.Exit ");

            System.out.println("Enter the choice : ");
            choice = sc.nextByte();

            if (choice >= 1 && choice <= 5) {
                System.out.println("Enter the first number : ");
                num1 = sc.nextDouble();
                System.out.println("Enter the second Number : ");
                num2 = sc.nextDouble();

                // use the switch case
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result : " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println(" Result: " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result : " + result);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Division By 0 is not allow  : ");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result  : " + result);
                            break;
                        }
                    case 5:
                        result = num1 %num2;
                        System.out.println("Result : " + result);

                }
            } else if (choice == 6) {
                System.out.println("Exit ! ");
            }
        }while (choice!=6);
        System.out.println("Calculator close : ");
    }
}
