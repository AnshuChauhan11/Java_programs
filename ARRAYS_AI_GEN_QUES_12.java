package COM.AI_CHAT_GPT;

import java.util.Scanner;

//Q12-> Find the smallest number in array
public class ARRAYS_AI_GEN_QUES_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array  : ");
        int size=sc.nextInt();
        int ar[]=new  int[size];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i <size ; i++) {
            ar[i]=sc.nextInt();

        }
        for (int i = 1; i < size; i++) {
            int min=ar[0];
            if (ar[i]<min){
                min=ar[i];
            }
            System.out.println("The maximum number in array is : "+min);
            break;
        }

    }
}
