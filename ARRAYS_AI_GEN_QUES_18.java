package COM.AI_CHAT_GPT;

import java.util.Scanner;

// Q8-. Find duplicate elements in an array
public class ARRAYS_AI_GEN_QUES_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int []ar=new int[size];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i <size ; i++) {
            ar[i]=sc.nextInt();
        }

        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if (ar[i]==ar[j]){
                    System.out.println("Duplicate found : "+ar[i]+" ");
                    break;
                }
            }
        }
    }
}
