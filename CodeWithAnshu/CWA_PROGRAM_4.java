package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        while (num!=0){
            int rem=num%10;
           sum+=rem;
            num/=10;
        }
        System.out.println("The sum of digit is : "+sum);
    }
}
