package COM.AI_CHAT_GPT;

import java.util.Scanner;

// Q11. -> FIND THE LARGEST ELEMENT IN AN ARRAY
public class ARRAYS_AI_GEN_QUES_11 {
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
            int max=ar[0];
            if (ar[i]>max){
                max=ar[i];
            }
            System.out.println("The maximum number in array is : "+max);
            break;
        }
    }
}
