package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class ARMSTRONG_NUMBER_1_TO_n_RANGE {
    public static void main(String[] args) {
        int num,temp,digit,sum,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range you want to find the armstrong number  : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            temp=i;
            count=0;

            // count the digit
            while (temp>0){
                count++;
                temp/=10;

            }

            temp=i;
            sum=0;
            // calculate the sum of digit

            while (temp >0){
                digit=temp%10;
                sum+=(int)Math.pow(digit,count);
                temp/=10;
            }
            // check if armstrong number
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
