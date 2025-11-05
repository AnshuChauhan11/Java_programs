package Com_Sem.CodeWithAnshu;

import java.util.Scanner;

public class CWA_PROGRAM_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int []ar=new int[size];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i <size ; i++) {
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        int avg=sum/2;
        System.out.println("The sum of array elements : "+sum);
        System.out.println("The average of array elelments : "+avg);
    }
}
