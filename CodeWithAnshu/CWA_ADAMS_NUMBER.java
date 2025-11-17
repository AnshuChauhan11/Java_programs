package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_ADAMS_NUMBER {

    static int reverse(int n){
        int rev=0;
        while (n!=0){
            int rem=n%10;
            rev+=rem+(rev*10);
            n/=10;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int sqOriginal=num*num;
        int RevSqOriginal=reverse(sqOriginal);
        int reversNumber=reverse(num);
        int SqReverseNumber=reversNumber*reversNumber;
        if (RevSqOriginal==SqReverseNumber){
            System.out.println("The number is Adams Number : ");
        } else{
            System.out.println("The number is not Adams Number : ");
        }
    }
}
