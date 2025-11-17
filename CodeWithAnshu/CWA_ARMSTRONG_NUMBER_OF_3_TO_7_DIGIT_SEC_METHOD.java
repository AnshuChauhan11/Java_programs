package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_ARMSTRONG_NUMBER_OF_3_TO_7_DIGIT_SEC_METHOD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int original=num;
        int sum=0,digit=0;
        int temp=num;

        // count digit
        while (temp>0){
            digit++;
            temp/=10;
        }

        // reset the temp value
        temp=num;

        // find the  pawer
        while (temp>0){
            int rem=temp%10;
            int pawer=1;
            // multiply by itself 'digit' times
            for (int i = 0; i <digit ; i++) {
                pawer=pawer*rem;
            }

            sum +=pawer;
            temp/=10;
        }
        if (sum==original){
            System.out.println(original+" "+"Is Armstrong Number : ");
        } else{
            System.out.println(original+" "+"Is not Armstrong Number : ");
        }
    }
}
