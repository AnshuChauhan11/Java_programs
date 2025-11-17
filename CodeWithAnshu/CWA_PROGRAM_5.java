package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num=sc.nextInt();
        int last=num%10;
        int first=0;
        while (num!=0){
            first=num%10;
            num/=10;
        }
        System.out.println("The sum of first and last digit is : "+(first+last));
    }
}
