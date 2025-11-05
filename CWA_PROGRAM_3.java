package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers = ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The result before swap "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The result after swap "+a+" "+b);
    }
}
