package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_ARMSTRONG_NUMBER_OF_3_TO_7_DIGIT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int   num=sc.nextInt();
        int  original =num;
        int  rem,sum=0;
        int digit=String.valueOf(num).length();
        while (num>0){
            rem=num%10;
            sum+=Math.pow(rem,digit);
            num/=10;
        }
        if (sum==original){
            System.out.println(original+" "+"Number is Armstrong ");
        } else{
            System.out.println(original+" "+"Number is not Armstrong : ");
        }
    }
}
