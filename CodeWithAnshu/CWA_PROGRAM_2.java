package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers = ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("The sum of these numbers = "+sum);
        System.out.println("The average of these numbers "+avg);
    }
}
