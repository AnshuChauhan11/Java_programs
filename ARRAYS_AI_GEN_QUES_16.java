package COM.AI_CHAT_GPT;

// Q6-> Check if an array is sorted or not
import java.util.Scanner;

public class ARRAYS_AI_GEN_QUES_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        boolean sorted=true;
        System.out.println("Enter the element of array : ");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <size-1 ; i++) {
            if (arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if (sorted==true){
            System.out.println("The array is sorted : Thanks ♥ ");
        }else {
            System.out.println("The array is not sorted : sorry ☻ ");
        }
    }
}
